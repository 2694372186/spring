package com.spring.demo01;

public class Client {
    public static void main(String[] args) {
        //房东
        Host host = new Host();
        //中介
        Proxy proxy=new Proxy(host);

        //租房不用找房东，找中介即可
        proxy.rent();

    }

}
