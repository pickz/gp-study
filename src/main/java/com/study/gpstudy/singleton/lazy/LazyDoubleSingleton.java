package com.study.gpstudy.singleton.lazy;

/**
 * 懒加载
 * @author     ：pengkz
 * @date       ： 2019/3/12-17:06
 * @modified by：
 */
public class LazyDoubleSingleton {
    private LazyDoubleSingleton(){}

    private static LazyDoubleSingleton LAZY_SINGLETON =null;

    public LazyDoubleSingleton getInstance(){
        if (LAZY_SINGLETON == null){
            synchronized (LazyDoubleSingleton.class){
                if (LAZY_SINGLETON == null){
                    LAZY_SINGLETON =new LazyDoubleSingleton();
                }
            }
        }
        return LAZY_SINGLETON;
    }
}
