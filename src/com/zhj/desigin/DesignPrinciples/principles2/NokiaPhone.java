package com.zhj.desigin.DesignPrinciples.principles2;

/**
 * Created by zhanghongjun on 16/10/17.
 */
public class NokiaPhone implements Phone {
    @Override
    public void call() {
        System.out.println("我用诺基亚手机打电话");
    }
}
