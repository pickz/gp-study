package com.study.gpstudy.singleton.hungry;

/**
 * 饿汉
 * @author     ：pengkz
 * @date       ： 2019/3/12-17:06
 * @modified by：
 */
public class HungryStaticSingleton {

    //饿汉式静态块单例
    private final static HungryStaticSingleton HUNGRY_STATIC_SINGLETON ;

    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance(){
        return HUNGRY_STATIC_SINGLETON;
    }

}
