package com.spring.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价于 <bean id="user" class="com.spring.pojo.User">
//@Component    组件
@Component
@Scope("prototype")
public class User {
    //等价于 <property name="name" value="樊磊"/>
//    @Value("樊磊")
    private String name;
    @Value("樊磊")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
