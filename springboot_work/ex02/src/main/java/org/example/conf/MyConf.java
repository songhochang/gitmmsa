package org.example.conf;

import org.example.components.AA;
import org.example.components.BB;
import org.example.components.CC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class MyConf {

    @Bean
    public AA aa(){
        return new AA();
    }

    @Bean
    public BB bb(){
        return new BB();
    }

    @Bean
    public CC cc(){
        return new CC();
    }

}
