package com.ssafy.codearena.problem.service;


import com.ssafy.codearena.alarm.dto.AlarmSendDto;
import com.ssafy.codearena.alarm.mapper.AlarmMapper;
import com.ssafy.codearena.problem.dto.*;
import com.ssafy.codearena.problem.mapper.ProblemMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProblemServiceImpl implements ProblemService{

    private final ProblemMapper mapper;

    private final AlarmMapper alarmMapper;

    private static final int ADMIN_ID = 1;

    private static final int ALARM_TYPE = 1;
    @Override
    public ResultDto getProblemList(HashMap<String, String> map) {
        ResultDto resultDto = new ResultDto();
        HashMap<String, String> hashMap = new HashMap<>();
        ProblemListDto problemListDto = new ProblemListDto();
        try{
            int spp = Integer.parseInt(map.get("spp"));
            String cate = map.get("cate");
            switch(cate) {
                case "problemTitle":
                    cate = "problem_title";
                    break;
                case "problemId":
                    cate = "problem_id";
                    break;
                case "userNickname":
                    cate = "user_nickname";
                    break;
            }
            hashMap.put("cate", cate);
            hashMap.put("word", map.get("word"));
            int totalItemCount = mapper.problemCount(hashMap);
            int totalPageCount = 1;
            if(totalItemCount > spp) totalPageCount = (totalItemCount%spp) == 0 ? totalItemCount/spp : totalItemCount/spp+1;
            int pgno = Integer.parseInt(map.get("pgno"));
            if(pgno > totalPageCount) pgno = totalPageCount;
            String orderBy = "";
            switch(map.get("orderBy")){
                case "date":
                    orderBy = "problem_date";
                    break;
                case "submit":
                    orderBy = "submit_count";
                    break;
                case "accept":
                    orderBy = "accept_count";
                    break;
                default:
                    orderBy = "percentage";
                    break;
            }
            hashMap.put("orderBy", orderBy);
            hashMap.put("start", String.valueOf((pgno-1) * spp));
            hashMap.put("offset", String.valueOf(spp));
            List<ProblemWithSearchDto> list = mapper.selectProblemList(hashMap);
            problemListDto.setProblemWithSearch(list);
            problemListDto.setItemCount(totalItemCount);
            problemListDto.setPageCount(totalPageCount);
            resultDto.setStatus("200");
            resultDto.setMsg("검색 결과가 "+problemListDto.getItemCount()+"건 존재합니다.");
            if(problemListDto.getItemCount() == 0){
                resultDto.setStatus("202");
            }
            resultDto.setData(problemListDto);
        }catch(Exception e){
            resultDto.setStatus("500");
            resultDto.setMsg("검색중 문제가 발생하였습니다.");
            e.printStackTrace();
        }finally{
            return resultDto;
        }
    }

    @Override
    public ResultDto insertProblem(ProblemForInsertDto problemForInsertDto) {
        ResultDto resultDto = new ResultDto();
        try{
            mapper.insertProblem(problemForInsertDto);
            TCListDto tcListDto = new TCListDto();
            tcListDto.setProblemId(problemForInsertDto.getProblemId());
            tcListDto.setTestCase(problemForInsertDto.getTestCase());
            log.debug("testcase : {}",tcListDto);
            mapper.insertTestCase(tcListDto);
            TagListDto tagListDto = new TagListDto();
            tagListDto.setProblemId(problemForInsertDto.getProblemId());
            tagListDto.setTagList(problemForInsertDto.getTagList());
            mapper.insertProblemTagList(tagListDto);
            /*
            * webFlux를 통해 데이터 전송
            *
            *
            * */

            resultDto.setStatus("201");
            resultDto.setMsg("문제 임시 생성 및 요청이 성공적으로 보내졌습니다.");
            AlarmSendDto alarmSendDto = new AlarmSendDto();
            alarmSendDto.setAlarmMsg("문제 확인 부탁드립니다. 문제번호 : "+ problemForInsertDto.getProblemId());
            alarmSendDto.setAlarmType(ALARM_TYPE);
            alarmSendDto.setAlarmStatus("요청 대기");
            alarmSendDto.setFromId(Integer.parseInt(problemForInsertDto.getUserId()));
            alarmSendDto.setToId(ADMIN_ID);
            alarmMapper.send(alarmSendDto);
        }catch(Exception e){
            log.error("exception : {}", e);
            resultDto.setStatus("500");
            resultDto.setMsg("문제 생성 로직 중 문제가 발생하였습니다.");
        }finally{
            return resultDto;
        }

    }
}