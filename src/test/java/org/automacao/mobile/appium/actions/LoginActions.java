package org.automacao.mobile.appium.actions;

import org.automacao.mobile.appium.pages.LoginPage;
import org.automacao.mobile.appium.pages.MasterPageFactory;

public class LoginActions {

    public static LoginPage loginPage(){
        return MasterPageFactory.getPage(LoginPage.class);
    }

    public static void validatePage(){
        loginPage().validatePage();
    }

    public static void fillPage(String usuario, String senha){
        LoginPage loginPage = loginPage();
        loginPage.getUser().sendKeys(usuario);
        loginPage.getPasswd().sendKeys(senha);
    }

    public static void submit(){
        loginPage().getBtnLogin().click();
    }
}
