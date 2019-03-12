package com.study.gpstudy.factory.biz;

import com.study.gpstudy.factory.IBiz.Bind;

/**
 * @author pengkz
 *
 */
public class EnglishBookBind implements Bind {
    @Override
    public String bind() {
        System.out.println("英语书装订好了");
        return "英语书装订好了";
    }
}
