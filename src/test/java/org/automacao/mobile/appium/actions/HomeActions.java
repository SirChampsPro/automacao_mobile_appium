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

    public static void clickMenuMain(){
        homePage().getBtnMenuMain().click();
    }

    public static void clickMenuUsers(){
        homePage().validateMenuMain();
        homePage().getBtnMenuUsers().click();
    }

    public static void clickMenuUsers(boolean clickMenuMain){

        if(clickMenuMain)
            clickMenuMain();

        clickMenuUsers();
    }

}
