package com.study.gpstudy.factory.simpleFactory;

import com.study.gpstudy.factory.IBiz.Print;

public class BookFactory {

    public Print printBook(Class<?> clazz){

        if (null != clazz){
            try {
                return  (Print) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
