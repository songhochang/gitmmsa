package com.green.fourhwang.repository;

import com.green.fourhwang.entity.Member;
import com.green.fourhwang.entity.Purchase;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
class PurchaseRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    PurchaseRepository purchaseRepository;

    @Test
    public void 회원_구매_엔티티_테스트() {
        // given (데이터 주어지면)
        Member member = new Member();
        member.setName("Test1");
        Member savedMember = memberRepository.save(member);

        log.info("멤버ID: {}", member.getId());
        assertThat(member.getId()).isNotNull();
        assertThat(member.getId()).isEqualTo(savedMember.getId());

        //when (데이터가 어느 행동을 할 때)
        Purchase purchase1 = new Purchase();
        Purchase purchase2 = new Purchase();
        purchase1.setMember(member);
        purchase2.setMember(member);


        purchaseRepository.save(purchase1);
        purchaseRepository.save(purchase2);


        log.info("구매1ID: {}", purchase1.getId());
        log.info("구매2ID: {}", purchase2.getId());
        //then (이 때 검증을 하는 메소드 활용해서 확인 (예측 값과 비교)
        assertThat(purchase1.getId()).isNotEqualTo(purchase2.getId());
        assertThat(purchase1.getId()).isNotNull();
        assertThat(purchase2.getId()).isNotNull();
        assertThat(purchase1.getMember().getId()).isEqualTo(member.getId());
        assertThat(purchase2.getMember().getId()).isEqualTo(member.getId());

    }


}