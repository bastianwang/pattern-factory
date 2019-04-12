package com.ziqi.designpattern.factory.abstractfactory;

import com.ziqi.designpattern.factory.bean.computermanager.ComputerManager;
import com.ziqi.designpattern.factory.bean.computermanager.QiHuComputerManager;
import com.ziqi.designpattern.factory.bean.mobilemanager.MobileManager;
import com.ziqi.designpattern.factory.bean.mobilemanager.QiHuMobileManager;

/**
 * 360安全软件
 */
public class QiHuSafeSoftwareFactory implements SafeSoftwareFactory {
    @Override
    public ComputerManager getComputerManager() {
        return new QiHuComputerManager();
    }

    @Override
    public MobileManager getMobileManager() {
        return new QiHuMobileManager();
    }

}
