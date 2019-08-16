package com.af.factory.abstractFactory.factory;

import com.af.factory.abstractFactory.product.INote;
import com.af.factory.abstractFactory.product.IVedio;

/**
 * @ClassName IcourseFactory
 * @Description 工厂模型
 * @Author {USER}
 * @Date 2019/8/14 10:58
 * @Version 1.0
 **/
public interface IcourseFactory {
    INote createNote();
    IVedio createVedio();
}
