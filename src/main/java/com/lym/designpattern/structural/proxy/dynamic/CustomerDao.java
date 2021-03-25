package com.lym.designpattern.structural.proxy.dynamic;

/**
 * @ClassName CustomerDao
 * @Description
 * @Author laiyiming
 * @Date 2021/2/8 14:32
 */
public interface CustomerDao {
    public void add();  //添加

    public void update();  //修改

    public void delete();  //删除

    public void find();  //查询
}
