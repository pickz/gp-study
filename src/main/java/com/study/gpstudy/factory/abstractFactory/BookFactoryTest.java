package com.study.gpstudy.factory.abstractFactory;

public class BookFactoryTest {

    public static void main(String[] args) {
        BookFactory factory=new EnglishBookFactory();
        factory.printBook().print();
        factory.bindBook().bind();
        factory.saleBook().sale();

        factory=new MathBookFactory();
        factory.printBook().print();
        factory.bindBook().bind();
        factory.saleBook().sale();


    }
}
