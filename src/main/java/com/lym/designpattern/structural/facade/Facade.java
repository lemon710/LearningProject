package com.lym.designpattern.structural.facade;

/**
 * @ClassName Facade
 * @Description 外观角色
 * @Author laiyiming
 * @Date 2021/3/4 16:12
 */
public class Facade {
    private SubSystem1 subSystem1 = new SubSystem1();
    private SubSystem2 subSystem2 = new SubSystem2();
    private SubSystem3 subSystem3 = new SubSystem3();

    public void method(){
        subSystem1.method();
        subSystem2.method();
        subSystem3.method();
    }
}
