package com.ziqi.designpattern.factory.methodfactory;

import com.ziqi.designpattern.factory.bean.pay.JdPay;
import com.ziqi.designpattern.factory.bean.pay.Pay;

/**
 * 京东支付工厂
 */
public class JdPayFactory implements MethodPayFactory {

    private static JdPay pay = null;

    @Override
    public Pay getPay() {
        if(pay == null){
            pay = new JdPay();
        }
        return pay;
    }
}
