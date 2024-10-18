package com.green.sahwang.config.topic.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .headers()  // 보안 헤더 설정
//                .frameOptions().disable().and()
//                .authorizeRequests()  // 권한 검증 설정
//                .antMatchers("/join/**").hasRole("USER")
//                .anyRequest().authenticated();
////                .and()
////                .formLogin();
////                .loginPage("/user/login").permitAll()
////                .defaultSuccessUrl("/index").and()
////                .logout()
////                .logoutUrl("/user/logout");
//    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/**").permitAll().anyRequest()
                .authenticated()
                .and()
                .httpBasic().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsManager userDetailsService() {
        UserDetails userDetails = //핵심 정보로 사용자의 인증 정보를 생성
                User.withDefaultPasswordEncoder()    // 패스워드를 암호화
                        .username("test") // usrname(id) 설정
                        .password("1234")            // password 설정
                        .roles("USER")               // 역할을 지정
                        .build();

        return new InMemoryUserDetailsManager(userDetails); //DI하여 빈 등록
    }

}
