package com.zhj.desigin.CreateModel.factory.FactoryMethod;

import com.zhj.desigin.CreateModel.factory.Phone;
import com.zhj.desigin.CreateModel.factory.SanuagPhone;

/**
 * Created by zhanghongjun on 16/10/17.
 */


//生产三星手机的工厂
public class SanuagFactory implements Factory{
    @Override
    public Phone produce() {
        return new SanuagPhone();
    }
}
