package org.automacao.mobile.appium.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;

@Getter
@NoArgsConstructor
public class UsuariosCriarAlterarPage extends PageBase {

    public void validatePage(){
        validateElementPresence("//*[@text='User Form']");
    }

    public void validateUserSavedSuccesfully() {validateElementPresence("//*[contains(@text,'User saved succesfully!')]");}

    public void validateUserLoadedSuccesfully() {validateElementPresence("//*[@text=' User loaded succesfully!']");}

    public void validateUserLoaded(String value) { validateElementPresence( "//*[contains(@text,'"  + value + "')]");}

    @AndroidFindBy(xpath = "//*[@resource-id='userId']")
    private WebElement txtId;

    @AndroidFindBy(xpath = "//*[@resource-id='userName1']")
    private WebElement txtName;

    @AndroidFindBy(xpath = "//*[@resource-id='userName2']")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "//*[@resource-id='userPassword1']")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//*[@resource-id='userPasswordConfirmation']")
    private WebElement txtPasswordConfirmation;

    @AndroidFindBy(xpath = "//*[@resource-id='userRoles']")
    private WebElement txtRoles;

    @AndroidFindBy(xpath = "//*[@resource-id='submit']")
    private WebElement btnSubmit;

    @AndroidFindBy(xpath = "//*[contains(@text,'User saved succesfully!')]")
    private WebElement lblUserSavedSuccesfully;

}

