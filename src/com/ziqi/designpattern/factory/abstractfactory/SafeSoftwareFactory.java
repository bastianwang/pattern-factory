package com.ziqi.designpattern.factory.abstractfactory;

import com.ziqi.designpattern.factory.bean.computermanager.ComputerManager;
import com.ziqi.designpattern.factory.bean.mobilemanager.MobileManager;

/**
 * 安全软件
 */
public interface SafeSoftwareFactory {


    ComputerManager getComputerManager();

    MobileManager getMobileManager();

}
