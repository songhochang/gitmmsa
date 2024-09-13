package org.example.customer;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    private int c_id;
    private String c_name;
    private String c_phone;
    private LocalDate join_date;
    private LocalDate withdraw_date;

    @Override
    public String toString() {
        return "Customer{" +
                "회원번호: " + c_id +
                ", 회원 이름: '" + c_name + '\'' +
                ", 회원 전화번호: '" + c_phone + '\'' +
                ", 가입일: " + join_date +
                ", 탈퇴일: " + withdraw_date +
                '}';
    }

}
