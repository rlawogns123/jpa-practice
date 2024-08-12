package com.example.starbucks.member.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {

    GENDER_MALE("남성"),
    GENDER_FEMALE("여성"),
    GENDER_OTHER("기타");

    public final String Gender;
}