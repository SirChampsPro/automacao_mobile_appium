package org.automacao.mobile.appium.actions;

import org.automacao.mobile.appium.pages.HomePage;
import org.automacao.mobile.appium.pages.MasterPageFactory;

public class HomeActions {

    public static HomePage homePage(){
        return MasterPageFactory.getPage(HomePage.class);
    }

    public static void validatePage(){
        homePage().validatePage();
    }
}
