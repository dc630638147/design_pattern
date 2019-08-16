package com.af.factory.abstractFactory.factory;

import com.af.factory.ICourse;
import com.af.factory.abstractFactory.factory.IcourseFactory;
import com.af.factory.abstractFactory.product.INote;
import com.af.factory.abstractFactory.product.IVedio;
import com.af.factory.abstractFactory.product.JavaNote;
import com.af.factory.abstractFactory.product.JavaVedio;

/**
 * @ClassName JavaFactory
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/14 11:02
 * @Version 1.0
 **/
public class JavaFactory implements IcourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public IVedio createVedio() {
        return new JavaVedio();
    }
}
