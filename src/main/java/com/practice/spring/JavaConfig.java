package com.practice.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public RemoveXML getXML(){
        RemoveXML removeXML = new RemoveXML();
        return removeXML;
    }
}
