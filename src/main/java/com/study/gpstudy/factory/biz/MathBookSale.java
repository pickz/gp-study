package com.study.gpstudy.factory.biz;

import com.study.gpstudy.factory.IBiz.Bind;
import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.IBiz.Sale;

/**
 * @author pengkz
 *
 */
public class MathBookSale implements Sale{
    @Override
    public String sale() {
        System.out.println("数学书可以卖了");
        return "数学书可以卖了";
    }
}
