package com.lym.designpattern.structural.proxy.normal;

/**
 * @ClassName Proxy
 * @Description 代理
 * @Author laiyiming
 * @Date 2021/2/8 14:21
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理...");
    }

    public void postRequest(){
        System.out.println("访问真实主题之后的后续处理...");
    }
}
