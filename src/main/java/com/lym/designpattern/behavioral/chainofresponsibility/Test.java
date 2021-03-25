package com.lym.designpattern.behavioral.chainofresponsibility;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/12 16:24
 */
public class Test {
    public static void main(String[] args) {
        //组装责任链
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();
        //Leader teacher4=new DeanOfStudies();
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher3.setNext(null);
        //提交请求
        teacher1.handleRequest(8);
    }
}
