package com.study.gpstudy.factory.abstractFactory;

import com.study.gpstudy.factory.IBiz.Bind;
import com.study.gpstudy.factory.IBiz.Print;
import com.study.gpstudy.factory.IBiz.Sale;

/**
 * @author pengkz
 */
public interface BookFactory {
    /**
     * 价格
     * @return
     */
    Print printBook();
    /**
     * 页数
     * @return
     */
    Bind bindBook();
    /**
     * 作者
     * @return
     */
    Sale saleBook();
}
