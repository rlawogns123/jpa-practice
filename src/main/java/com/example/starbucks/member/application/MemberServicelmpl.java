package com.example.starbucks.member.application;

import com.example.starbucks.member.domain.Member;
import com.example.starbucks.member.dto.MemberSignUpDto;
import com.example.starbucks.member.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServicelmpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void signUp(MemberSignUpDto memberSignUpDto) {
        Member member = memberSignUpDto.toEntity();
//        todo : MemberSignUpDto를 Member로 변환하여 저장
    }

    @Override
    public Member getMemberById(Long id) {
//        Member member = memberRepository.findById(id);
        return null;
    }

    @Override
    public Member getMemberByEmail(String email) {
        Member member = memberRepository.findByEmail(email);
        return null;
    }
}


