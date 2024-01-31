package com.ssafy.codearena.user.service;

import com.ssafy.codearena.user.dto.UserJoinDto;
import com.ssafy.codearena.user.dto.UserLoginDto;
import com.ssafy.codearena.user.dto.UserResultDto;

public interface UserService {

    UserResultDto join(UserJoinDto userJoinDto);
    UserResultDto login(UserLoginDto userLoginDto);

    UserResultDto checkDuplicatedNickname(String nickname);

    UserResultDto checkDuplicatedEmail(String email);

}