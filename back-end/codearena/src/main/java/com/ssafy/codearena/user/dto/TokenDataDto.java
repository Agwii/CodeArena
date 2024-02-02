package com.ssafy.codearena.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class TokenDataDto {
    private String userId;
    private String userEmail;
    private String userNickname;
}