package com.study.gpstudy.singleton.register;

/**
 * 注册式单例 spring中的做法，就是用这种注册式单例
 *
 * @author ：pengkz
 * @date ： 2019/3/12-18:09
 * @modified by：
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
