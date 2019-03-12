package com.study.gpstudy.factory.abstractFactory;

import com.study.gpstudy.factory.IBiz.Bind;
import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.IBiz.Sale;
import com.study.gpstudy.factory.biz.MathBookBind;
import com.study.gpstudy.factory.biz.MathBookPrint;
import com.study.gpstudy.factory.biz.MathBookSale;

/**
 * @author pengkz
 */
public class MathBookFactory implements BookFactory{

    @Override
    public Print printBook() {
        return new MathBookPrint();
    }

    @Override
    public Bind bindBook() {
        return new MathBookBind();
    }

    @Override
    public Sale saleBook() {
        return new MathBookSale();
    }
}
