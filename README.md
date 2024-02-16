# 🖥 SSAFY 2학기 공통 프로젝트 - CodeArena

## 🎥 시연영상

### >> https://codearena.shop/ <<

## 🪪 개요

### 코딩이 선택이 아닌 필수가 되어가는 단계에서

### 프로그래머로서 취업하기 위한 첫 발판인 코딩테스트를 즐겁게!

코딩테스트가 대부분의 프로그래머에게 가장 신경쓰이고 힘든 요소 중 하나입니다.

이런 코딩테스트 학습의 경우, 혼자서 충분한 시간을 갖고 공부하는것도 중요하지만

"내가 이제 어느정도 실력일까?" 혹은 "혼자 하니까 따분해" 라는 생각이 들 수 있습니다.

코드아레나는 기본적인 다른 온라인 저지 사이트에서의 장점들을 모으고

코드아레나만의 특색인 레이팅 매칭 시스템을 추가함으로서 재미있는 학습을 할 수 있도록 장려합니다.

## 🚩 개발기간

|  | [프로젝트 일정] |
| :---:|:---:|
|진행 기간|2024.01.-2024.02.|
|인원|6명|
|시간|평일 09:00-18:00|

## 🤖 팀원 구성

<table>
 <tr>
    <td align="center"><a href="https://github.com/kimhaechang1"><img src="https://avatars.githubusercontent.com/kimhaechang1" width="130px;" alt=""></a></td>
    <td align="center"><a href="https://github.com/Be-HinD"><img src="https://avatars.githubusercontent.com/Be-HinD" width="130px;" alt=""></a></td>
    <td align="center"><a href="https://github.com/Agwii"><img src="https://avatars.githubusercontent.com/Agwii" width="130px;" alt=""></a></td>
    <td align="center"><a href="https://github.com/wkdtpwjd19"><img src="https://avatars.githubusercontent.com/wkdtpwjd19" width="130px;" alt=""></a></td>
   <td align="center"><a href="https://github.com/timber3"><img src="https://avatars.githubusercontent.com/timber3" width="130px;" alt=""></a></td>
   <td align="center"><a href="https://github.com/YangGeoun"><img src="https://avatars.githubusercontent.com/YangGeoun" width="130px;" alt=""></a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/Be-kimhaechang1"><b>김회창</b></a><p><b>팀장</b><p><b>Back-end</b></p><p>매칭서버 개발</p><p>Problem Solving API 개발</p><p>인프라 구축</p></p></td>
    <td align="center"><a href="https://github.com/Be-HinD"><b>김정현</b></a><p><b>팀원</b></p><p><b>Back-end</b></p><p>아레나 게임서버 개발</p><p>알림 & 게시판 API 개발</p><p>화면공유 시스템 관리</p></p></td>
    <td align="center"><a href="https://github.com/Agwii"><b>이귀현</b></a><p><b>팀원</b></p><p><b>Front-end</b></p><p>아레나 컴포넌트 개발</p></td>
    <td align="center"><a href="https://github.com/wkdtpwjd19"><b>장세정</b></a><p><b>팀원</b></p><p><b>Front-end</b></p><p>알림 & 게시판 컴포넌트 개발</p><p>회원 컴포넌트 개발</p></td>
    <td align="center"><a href="https://github.com/timber3"><b>오승현</b></a><p><b>팀원</b></p><p><b>Back-end</b></p><p>채점서버 개발</p><p>회원관리 API 개발</p></p></td>
    <td align="center"><a href="https://github.com/YangGeoun"><b>양건우</b></a><p><b>팀원</b></p><p><b>Front-end</b></p><p>Problem Solving 컴포넌트 개발</p><p>화면 공유 컴포넌트 개발</p></p></td>
  </tr>
</table>

<br/>

## 📌 커밋 컨벤션

<h3> Type 명세 </h3>
<table>
  <tr>
<td><p><b>[Feat]</p> : 기능 개발 완료</p></td>
<td><p><b>[Modify]</p> : 기능 개발 중 수정 사항 발생</p></td>
<td><p><b>[Refactor]</p> : 리팩토링 수행</p></td>
<td><p><b>[Docs]</p> : 문서 작업</p></td>
<td><p><b>[Test]</p> : 테스트 코드 작성</p></td>
<td><p><b>[Design]</p> : CSS, UI 수정</p></td>
<td><p><b>[Remove]</p> : 파일 삭제</p></td>
  </tr>
</table>
<hr>
<h3> Commit Example </h3>
<p>feat 커밋 예시 (JIRA 고유번호 4번 Task의 경우) </p>
<p>[Type] Subject //타입의 경우 첫글자는 대문자로 작성, 커밋 내용이 뚜렷하게 드러날 수 있도록 작성 </p>
<p>body //Subject 관련 어떤 작업을 했는지에 대해 간단하게 작성 </p>
<p>footer //JIRA Task 번호와 매칭 </p>
<table>
  <tr>
<td><p><b>[Feat] 로그인 기능 구현</b></p>

<p><b>로그인 API 구현 </b></p>

<p><b>Related to : D211-4 </b></p></td>
  </tr>
</table>



## 📁 Repository 폴더 구조
<p> 추후 추가 필요 </p>


## 📌 브랜치 전략

### Git-Flow 전략 및 Github-Flow을 기반으로 한 커스텀 전략 채택

- 사용 브랜치

  - feature : 기능개발
  - fix : 긴급 수정
  - develop : CI/CD Hook 브랜치

- Gerrit 사용 전략

  - feature 브랜치에서 기능구현이 완료되면 원격 EC2 Gerrit으로 HEAD:refs/for/[브랜치명]으로 Commit&Push로 리뷰 Open
  - 1차적으로 마니또 리뷰어가 코드리뷰 진행 및 Submit
  - 마니또의 일정이 바쁘다면 같은 포지션 동료가 코드리뷰 진행
  - 리뷰 승인 이후 develop으로 merge 후 CI/CD 배포

- 브랜치 명명 규칙
  - feature/기능 명시-{BE or FE}
    - FE Example : feature/login-FE
    - BE Example : fix/login-BE

## ⚙ 서비스 아키텍쳐

![Architecture](/asset/img/Architecture.png)

## 🎬 Figma Design

### Main

![Main](/asset/img/figma-main.png)
<br>
<br>
<br>
<br>

### Login

![Main](/asset/img/Figma-Login.png)

<br>
<br>
<br>
<br>

### Community

![Main](/asset/img/figma-community.png)

<br>
<br>
<br>
<br>

### Problem Solving

![Main](/asset/img/figma-ps1.png)

<br>
<br>
<br>

![Main](/asset/img/figma-ps2.png)

<br>
<br>
<br>

![Main](/asset/img/figma-ps3.png)

<br>
<br>
<br>
<br>

### Arena Main

![Main](/asset/img/figma-arena.png)

<br>
<br>
<br>
<br>

### MyPage

![Main](/asset/img/figma-profile.png)

<br>
<br>
<br>
<br>

### Matching

![Main](/asset/img/figma-matching.png)

<br>
<br>
<br>
<br>

### INGAME

![Main](/asset/img/figma-arena-ingame-1.png)

<br>
<br>
<br>
<br>

### SPECTATORS

![Main](/asset/img/figma-arena-spec.png)

<br>
<br>
<br>
<br>

### RESULT

![Main](/asset/img/figma-game-result.png)

<br>
<br>
<br>
<br>

## 주요 기능

### 메인 화면

![Main](/asset/gif/Main.gif)

### 문제 풀이

![Main](/asset/gif/ps.gif)

### 마이 페이지

![Main](/asset/gif/Mypage.gif)

### 아레나 통계

![Main](/asset/gif/arena_main.gif)    

### 매칭 진행



### 스피드전 진행, 화면공유 그리고 결과

### 효율전 진행, 중간 채점현황

### 관전자 배팅 및 채팅
