package com.spring.demo02;

public class ServiceProxy {
    private ServiceImpl service;

    public void setService(ServiceImpl service) {
        this.service = service;
    }
    public void add(){
        rent("Add");
        service.add();
    }

    public void rent(String str){
        System.out.println("使用了"+str+"方法");
    }
}
