package com.af.factory.abstractFactory.factory;

import com.af.factory.abstractFactory.product.INote;
import com.af.factory.abstractFactory.product.IVedio;
import com.af.factory.abstractFactory.product.PythonNote;
import com.af.factory.abstractFactory.product.PythonVedio;

/**
 * @ClassName PythonFactory
 * @Description
 * @Author
 * @Date 2019/8/14 11:03
 * @Version 1.0
 **/
public class PythonFactory implements IcourseFactory{
    public INote createNote() {
        return new PythonNote();
    }

    public IVedio createVedio() {
        return new PythonVedio();
    }
}
