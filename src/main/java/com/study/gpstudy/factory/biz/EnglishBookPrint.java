package com.study.gpstudy.factory.biz;

import com.study.gpstudy.factory.IBiz.Print;

/**
 * @author pengkz
 *
 */
public class EnglishBookPrint implements Print{

    @Override
    public String print() {
        System.out.println("英语书印刷好了");
        return "英语书印刷好了";
    }

}
