package com.sparta.week03.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemoRequestDto {
    private LocalDateTime createdAt;
    private java.time.LocalDateTime modifiedAt;
    private String username;
    private String contents;
    private String title;
    private String password;
}
