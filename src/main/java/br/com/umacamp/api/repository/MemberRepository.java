package br.com.umacamp.api.repository;

import br.com.umacamp.api.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

