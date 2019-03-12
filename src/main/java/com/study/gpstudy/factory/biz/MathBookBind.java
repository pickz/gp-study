package com.study.gpstudy.factory.biz;

import com.study.gpstudy.factory.IBiz.Bind;
import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.IBiz.Sale;

/**
 * @author pengkz
 *
 */
public class MathBookBind implements Bind {
    @Override
    public String bind() {
        System.out.println("数学书装订好了");
        return "数学书装订好了";
    }
}
