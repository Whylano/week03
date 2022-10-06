package com.sparta.week03.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class SearchTitleResponeDto {
    private String username;
    private String contents;
    private String title;


    public void SearchTitleResponeDto(String username,String contents,String title){
    this.title = title;
    this.username = username;
    this.contents = contents;
    }
}


