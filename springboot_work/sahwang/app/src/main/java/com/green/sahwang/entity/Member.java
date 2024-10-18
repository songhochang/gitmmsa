package com.green.sahwang.entity;

import com.green.sahwang.entity.enumtype.MemberRole;
import com.green.sahwang.entity.enumtype.SnsType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberRole role;

    private String phoneNum;

    @Column(unique = true)

    private String email;

    private String address;

    private SnsType snsType;

    private String nickName;

    private Boolean adReceived;

    private String account;

    private Boolean isDeleted;

    private LocalDateTime joinDate;

    private LocalDateTime withdrawDate;

    private String password;

    // 이건 어떻게 해야되???
//    private

}
