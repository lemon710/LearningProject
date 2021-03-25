package com.lym.designpattern.structural.flyweight;

/**
 * @ClassName UnSharedConcreteFlyweight
 * @Description 非享元角色
 * @Author laiyiming
 * @Date 2021/3/5 15:11
 */
public class UnSharedConcreteFlyweight {
    private String info;

    UnSharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
