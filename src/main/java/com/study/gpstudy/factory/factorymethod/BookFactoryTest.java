package com.study.gpstudy.factory.factorymethod;

import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.biz.EnglishBookPrint;

public class BookFactoryTest {
    public static void main(String[] args) {
        BookFactory factory= new EnglishBookFactory();
        Print ep=factory.printBook();
        ep.print();
    }
}
