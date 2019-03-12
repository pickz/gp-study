package com.study.gpstudy.factory.factorymethod;

import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.biz.EnglishBookPrint;

public class EnglishBookFactory implements BookFactory {
    @Override
    public Print printBook() {
        return new EnglishBookPrint();
    }
}
