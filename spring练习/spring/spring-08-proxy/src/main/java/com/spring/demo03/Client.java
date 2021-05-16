package com.spring.demo03;

import com.spring.demo02.ServiceProxy;

public class Client {
    public static void main(String[] args) {
        //真实角色
      ServiceImpl service=new ServiceImpl();
        //代理角色，不存在
      ProxyInvocationHandler pih=new ProxyInvocationHandler();
      pih.setTarget(service);//设置要代理的对象
      //动态生成代理类
        Service proxy= (Service) pih.getProxy();
        proxy.add();
    }
}
