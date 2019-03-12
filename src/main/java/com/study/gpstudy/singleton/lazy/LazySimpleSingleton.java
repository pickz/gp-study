package com.study.gpstudy.singleton.lazy;

/**
 * @author ：pengkz
 * @date ： 2019/3/12-17:54
 * @modified by：
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static  LazySimpleSingleton LAZY_SIMPLE_SINGLETON = null;
    //静态块，公共内存区域  在外部需要使用的时候才进行实例化

    /**
     * 效率低
     * @return
     */
    public static synchronized LazySimpleSingleton getInstance(){
       if (LAZY_SIMPLE_SINGLETON == null){
           LAZY_SIMPLE_SINGLETON =new LazySimpleSingleton();
       }
       return  LAZY_SIMPLE_SINGLETON;
    }
}
