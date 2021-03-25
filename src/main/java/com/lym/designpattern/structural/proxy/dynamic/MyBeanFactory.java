package com.lym.designpattern.structural.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName MyBeanFactory
 * @Description
 * @Author laiyiming
 * @Date 2021/2/8 14:40
 */
public class MyBeanFactory {
    public static CustomerDao getBean() {
        //准备目标类
        final CustomerDao customerDao = new CustomerDaoImpl();
        //创建切面类实例
        final MyAspect myAspect = new MyAspect();
        //使用代理类，进行增强
        return (CustomerDao) Proxy.newProxyInstance(
                MyBeanFactory.class.getClassLoader(),
                new Class[]{CustomerDao.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        myAspect.myBefore();
                        Object obj = method.invoke(customerDao, args);
                        myAspect.myAfter();
                        return obj;
                    }
                }
        );
    }

}
