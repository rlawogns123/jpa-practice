package com.example.starbucks.member.presentation;

import com.example.starbucks.member.application.MemberService;
import com.example.starbucks.member.vo.MemberRequestVo;
import com.example.starbucks.member.dto.MemberSignUpDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody MemberRequestVo memberRequestVo) {

        ModelMapper mapper = new ModelMapper();
        MemberSignUpDto memberSignUpDto = mapper.map(memberRequestVo, MemberSignUpDto.class);
        memberService.signUp(memberSignUpDto);
    }

    @GetMapping("/{id}")
    public void getMemberById(@PathVariable Long id) {
        memberService.getMemberById(id);
    }
}
