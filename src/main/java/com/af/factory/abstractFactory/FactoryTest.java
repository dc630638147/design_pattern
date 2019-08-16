package com.af.factory.abstractFactory;

import com.af.factory.abstractFactory.factory.JavaFactory;
import com.af.factory.abstractFactory.factory.PythonFactory;
import com.af.factory.abstractFactory.product.INote;
import com.af.factory.abstractFactory.product.IVedio;

/**
 * @ClassName FactoryTest
 * @Description
 * @Author {USER}
 * @Date 2019/8/14 11:08
 * @Version 1.0
 **/
public class FactoryTest {
    public static void main(String[] args) {
        JavaFactory javaFactory = new JavaFactory();
        INote note = javaFactory.createNote();
        note.note();

        PythonFactory pythonFactory = new PythonFactory();
        IVedio vedio = pythonFactory.createVedio();
        vedio.vedio();
    }
}
