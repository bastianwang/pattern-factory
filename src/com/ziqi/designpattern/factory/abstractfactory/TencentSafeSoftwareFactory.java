package com.ziqi.designpattern.factory.abstractfactory;

import com.ziqi.designpattern.factory.bean.computermanager.ComputerManager;
import com.ziqi.designpattern.factory.bean.computermanager.TecentComputerManager;
import com.ziqi.designpattern.factory.bean.mobilemanager.MobileManager;
import com.ziqi.designpattern.factory.bean.mobilemanager.TencentMobileManager;

/**
 * 腾讯安全软件
 */
public class TencentSafeSoftwareFactory implements SafeSoftwareFactory {
    @Override
    public ComputerManager getComputerManager() {
        return new TecentComputerManager();
    }

    @Override
    public MobileManager getMobileManager() {
        return new TencentMobileManager();
    }
}
