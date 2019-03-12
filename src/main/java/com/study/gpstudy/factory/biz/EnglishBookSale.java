package com.study.gpstudy.factory.biz;

import com.study.gpstudy.factory.IBiz.Sale;

/**
 * @author pengkz
 *
 */
public class EnglishBookSale implements Sale{
    @Override
    public String sale() {
        System.out.println("英语书可以卖了");
        return "英语书可以卖了";
    }
}
