package com.study.gpstudy.factory.abstractFactory;

import com.study.gpstudy.factory.IBiz.Bind;
import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.IBiz.Sale;
import com.study.gpstudy.factory.biz.EnglishBookBind;
import com.study.gpstudy.factory.biz.EnglishBookPrint;
import com.study.gpstudy.factory.biz.EnglishBookSale;

/**
 * @author pengkz
 */
public class EnglishBookFactory implements BookFactory{

    @Override
    public Print printBook() {
        return new EnglishBookPrint();
    }

    @Override
    public Bind bindBook() {
        return new EnglishBookBind();
    }

    @Override
    public Sale saleBook() {
        return new EnglishBookSale();
    }
}
