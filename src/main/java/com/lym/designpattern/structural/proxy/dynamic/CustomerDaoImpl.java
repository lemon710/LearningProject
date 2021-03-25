package com.lym.designpattern.structural.proxy.dynamic;

/**
 * @ClassName CustomerDaoImpl
 * @Description
 * @Author laiyiming
 * @Date 2021/2/8 14:35
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public void add() {
        System.out.println("添加客户...");
    }

    @Override
    public void update() {
        System.out.println("修改客户...");
    }

    @Override
    public void delete() {
        System.out.println("删除客户...");
    }

    @Override
    public void find() {
        System.out.println("修改客户...");
    }
}
