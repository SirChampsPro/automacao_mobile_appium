package org.automacao.mobile.appium.actions;


import org.automacao.mobile.appium.pages.MasterPageFactory;
import org.automacao.mobile.appium.pages.UsuariosPage;

public class UsuariosActions {

    public static UsuariosPage usuariosPage() {
        return MasterPageFactory.getPage(UsuariosPage.class);
    }

    public static void validatePage(){
        usuariosPage().validatePage();
    }

    public static  void validateUserListLoadedSuccesfully(){
        usuariosPage().validateUserListLoadedSuccesfully();
    }

    public static  void clickNewUser(){
        usuariosPage().getBtnNewUser().click();
    }

    public static void search(String value){
        usuariosPage().sendKeys(usuariosPage().getTxtSearch(), value);
    }

    public static void validateUserInList(String value){
        usuariosPage().validateUserInList(value);
    }

}

