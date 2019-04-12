package com.ziqi.designpattern.factory.methodfactory;

import com.ziqi.designpattern.factory.bean.pay.Pay;
import com.ziqi.designpattern.factory.bean.pay.WeChatPay;

/**
 * 微信支付工厂
 */
public class WeChatPayFactory implements MethodPayFactory {

    private static WeChatPay pay = null;

    @Override
    public Pay getPay() {
        if(pay == null){
            pay = new WeChatPay();
        }
        return pay;
    }
}
