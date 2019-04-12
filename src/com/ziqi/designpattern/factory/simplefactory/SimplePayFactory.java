package com.ziqi.designpattern.factory.simplefactory;

import com.ziqi.designpattern.factory.bean.pay.AliPay;
import com.ziqi.designpattern.factory.bean.pay.JdPay;
import com.ziqi.designpattern.factory.bean.pay.WeChatPay;

/**
 * 简单支付工厂
 */
public class SimplePayFactory {
    public static Object getPay(String payName){
        if("aliPay".equals(payName)){
            return new AliPay();
        }else if("jdPay".equals(payName)){
            return  new JdPay();
        }else if ("weChatPay".equals(payName)){
            return  new WeChatPay();
        }
        return null;
    }
}
