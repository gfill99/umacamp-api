package br.com.umacamp.api.controller;

import br.com.umacamp.api.member.Member;
import br.com.umacamp.api.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberRepository repository;

    public MemberController(MemberRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Member> list() {
        return repository.findAll();
    }

    @PostMapping
    public Member create(@RequestBody Member member) {
        return repository.save(member);
    }
}
