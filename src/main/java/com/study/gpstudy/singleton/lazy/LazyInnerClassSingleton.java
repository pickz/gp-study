package com.study.gpstudy.singleton.lazy;

/**
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 * 完美地屏蔽了这两个缺点
 * 史上最牛B的单例模式的实现方式
 *
 * @author ：pengkz
 * @date ： 2019/3/12-17:57
 * @modified by：
 */
public class LazyInnerClassSingleton {
    //默认使用LazyInnerClassGeneral的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazyInnerClassSingleton() {
        if (LazyHolder.lazyInnerClassSingleton != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }


    public static final LazyInnerClassSingleton getInstance() {
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.lazyInnerClassSingleton;
    }

    /**
     * 默认不加载，当调用时才会初始化数据
     */
    private static class LazyHolder {
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }

}
