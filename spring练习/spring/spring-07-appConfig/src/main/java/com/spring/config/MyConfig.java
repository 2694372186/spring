package com.spring.config;


import com.spring.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//会被Spring容器托管，注册到容器中，因为他本来就是一个@Component
//@Configuration代表这是一个配置类，就等同于beans.xml
@Configuration
@ComponentScan("com.spring.pojo")
@Import(Myconfig2.class)
public class MyConfig {

    //@Bean 相当与 <bean id="方法名" class="方法返回值"/>
    @Bean
    public User getUser(){
        return new User(); //返回的是   要注入Bean的对象！
    }
}
