package com.spring.demo02;

public class Client {
    public static void main(String[] args) {
      ServiceImpl service=new ServiceImpl();

      ServiceProxy serviceProxy=new ServiceProxy();
      serviceProxy.setService(service);
      serviceProxy.add();
    }
}
