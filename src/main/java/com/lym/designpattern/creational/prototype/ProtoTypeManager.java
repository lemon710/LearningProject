package com.lym.designpattern.creational.prototype;

import java.util.HashMap;

/**
 * @ClassName ProtoTypeManager
 * @Description 原型管理器
 * @Author laiyiming
 * @Date 2021/1/26 11:32
 */
public class ProtoTypeManager {
    private HashMap<String,Shape> ptm = new HashMap<>();

    public ProtoTypeManager() {
        ptm.put("Circle",new Circle());
        ptm.put("Square",new Square());
    }

    public void addShape(String key, Shape shape) {
        ptm.put(key,shape);
    }

    public Shape getShape(String key) {
        Shape temp = ptm.get(key);
        return (Shape) temp.clone();
    }
}
