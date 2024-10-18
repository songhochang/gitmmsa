package com.green.sahwang.dto.request;

import com.green.sahwang.entity.Product;
import com.green.sahwang.entity.product.Candle;
import com.green.sahwang.entity.product.Perfume;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinReqDto {

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    private Product product;
}
