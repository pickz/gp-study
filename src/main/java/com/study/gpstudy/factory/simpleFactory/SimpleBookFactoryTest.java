package com.study.gpstudy.factory.simpleFactory;

import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.abstractFactory.EnglishBookFactory;
import com.study.gpstudy.factory.biz.EnglishBookPrint;

public class SimpleBookFactoryTest {

    public static void main(String[] args) {
        BookFactory factory=new BookFactory();
        Print print= factory.printBook(EnglishBookPrint.class);
        print.print();
    }
}
