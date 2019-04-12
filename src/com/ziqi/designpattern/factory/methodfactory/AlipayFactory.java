package com.ziqi.designpattern.factory.methodfactory;

import com.ziqi.designpattern.factory.bean.pay.AliPay;
import com.ziqi.designpattern.factory.bean.pay.Pay;

/**
 * 阿里支付工厂
 */
public class AlipayFactory implements MethodPayFactory {

    private static AliPay pay = null;

    @Override
    public Pay getPay() {
        if(pay == null){
            pay = new AliPay();
        }
        return pay;
    }
}
