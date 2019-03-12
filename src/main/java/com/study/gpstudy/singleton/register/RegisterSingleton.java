package com.study.gpstudy.singleton.register;

import org.apache.ibatis.ognl.IntHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册式单例 spring中的做法，就是用这种注册式单例
 *
 * @author ：pengkz
 * @date ： 2019/3/12-18:09
 * @modified by：
 */
public class RegisterSingleton {
    private RegisterSingleton() {
    }

    private static Map<String, Object> clazz = new HashMap<String, Object>();

    public static Object getInstance(String className) {

        synchronized (clazz) {
            if (clazz.containsKey(className)) {
                return clazz.get(className);
            } else {
                Object object = null;
                try {
                    object = Class.forName(className);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return object;

            }
        }
    }
}
