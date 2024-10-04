package com.green.fourhwang.repository;

import com.green.fourhwang.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
