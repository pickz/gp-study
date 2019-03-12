package com.study.gpstudy.factory.factorymethod;

import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.biz.MathBookPrint;

public class MathBookFactory implements BookFactory {
    @Override
    public Print printBook() {
        return new MathBookPrint();
    }
}
