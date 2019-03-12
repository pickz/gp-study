package com.study.gpstudy.factory.biz;

import com.study.gpstudy.factory.IBiz.Bind;
import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.IBiz.Sale;

/**
 * @author pengkz
 *
 */
public class MathBookPrint implements Print{

    @Override
    public String print() {
        System.out.println("数学书印刷好了");
        return "数学书印刷好了";
    }

}
