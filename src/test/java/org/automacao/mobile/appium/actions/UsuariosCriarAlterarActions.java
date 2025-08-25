package org.automacao.mobile.appium.actions;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.automacao.mobile.appium.TempStorage;
import org.automacao.mobile.appium.pages.MasterPageFactory;
import org.automacao.mobile.appium.pages.UsuariosCriarAlterarPage;

import java.util.Locale;

@Slf4j
public class UsuariosCriarAlterarActions {

    public static UsuariosCriarAlterarPage usuariosCriarAlterarPage(){
        return MasterPageFactory.getPage(UsuariosCriarAlterarPage.class);
    }

    public static void validatePage(){
        usuariosCriarAlterarPage().validatePage();
    }


    public static void submit(){
        usuariosCriarAlterarPage().getBtnSubmit().click();
    }

    public static void fillForm(){

        Faker faker = Faker.instance(new Locale("pt_BR"));

        TempStorage.name = faker.name().fullName();

        log.info("New user name [" + TempStorage.name + "]");

        UsuariosCriarAlterarPage usuariosCriarAlterarPage = usuariosCriarAlterarPage();
        usuariosCriarAlterarPage.getTxtName().click();
        usuariosCriarAlterarPage.sendKeys(usuariosCriarAlterarPage.getTxtName(), TempStorage.name);
        usuariosCriarAlterarPage.delay();
        usuariosCriarAlterarPage.hideKeyboard();
        usuariosCriarAlterarPage.sendKeys(usuariosCriarAlterarPage.getTxtUsername(), faker.internet().emailAddress());
        usuariosCriarAlterarPage.sendKeys(usuariosCriarAlterarPage.getTxtPassword(), "password01");
        usuariosCriarAlterarPage.swipeVertical();
        usuariosCriarAlterarPage.sendKeys(usuariosCriarAlterarPage.getTxtPasswordConfirmation(), "password01");
        usuariosCriarAlterarPage.sendKeys(usuariosCriarAlterarPage.getTxtRoles(), "ROLE_ADMIN");
        usuariosCriarAlterarPage.swipeVertical();
    }

    public static void validateUserSavedSuccesfully(){
        usuariosCriarAlterarPage().validateUserSavedSuccesfully();
    }
}


