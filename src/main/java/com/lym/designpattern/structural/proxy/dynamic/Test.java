package com.lym.designpattern.structural.proxy.dynamic;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/3 14:42
 */
public class Test {
    public static void main(String[] args) {
        CustomerDao customerDao = MyBeanFactory.getBean();
        customerDao.add();
        customerDao.delete();
        customerDao.find();
        customerDao.update();
    }
}
