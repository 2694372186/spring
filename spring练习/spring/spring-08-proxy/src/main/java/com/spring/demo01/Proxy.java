package com.spring.demo01;

public class Proxy {
    private Host host;

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void rent(){
        seeHouse();
        host.rent();
        heTong();
        fare();
    }

    public Proxy(Host host) {
        this.host = host;
    }

    //看房子
    public void seeHouse(){
        System.out.println("看房子");
    }

    //签合同
    public void heTong(){
        System.out.println("签合同");
    }

    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
