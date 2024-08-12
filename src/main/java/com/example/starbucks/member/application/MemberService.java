package com.example.starbucks.member.application;

import com.example.starbucks.member.domain.Member;
import com.example.starbucks.member.dto.MemberSignUpDto;

public interface MemberService {
    void signUp(MemberSignUpDto memberSignUpDto);
    Member getMemberById(Long id);
    Member getMemberByEmail(String email);
}
