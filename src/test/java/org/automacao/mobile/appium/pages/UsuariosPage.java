package org.automacao.mobile.appium.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;

@Getter
@NoArgsConstructor
public class UsuariosPage extends PageBase {

    public void validatePage(){
        validateElementPresence("//*[contains(@text, 'User List')]");
    }

    public void validateUserListLoadedSuccesfully(){
        validateElementPresence("//*[@text=' Users list loaded succesfully!']");
    }

    public void validateUserAlert(){
        validateElementPresence("//*[contains(@text,'Are you to drop the user with {Id:')]");
    }

    public void validateUserInList(String value){
        validateElementPresence("//*[contains(@text,'" + value + "')]");
    }

    public void validateUserDeleted() {validateElementPresence("//*[contains(@text,'User deleted sucessfully!')]");}

    @AndroidFindBy(xpath = "//*[@resource-id='button-forms-customer-create']")
    private WebElement btnNewUser;

    @AndroidFindBy(xpath = "//*[@resource-id='table-customers_filter']/android.view.View/android.widget.EditText")
    private WebElement txtSearch;

    @AndroidFindBy(xpath = "//*[@text=' Users list loaded succesfully!']")
    private WebElement lblUserListLoadedSuccesfully;

    @AndroidFindBy(xpath = "(//*[@resource-id='button-forms-customer-update'])[1]")
    private WebElement btnUpdateUser1;

    @AndroidFindBy(xpath = "(//*[@resource-id='button-customer-delete'])[1]")
    private WebElement btnDeleteUser1;

    @AndroidFindBy(xpath = "//*[contains(@text,'Are you to drop the user with {Id:')]")
    private WebElement lblAlertText;

    @AndroidFindBy(xpath = "//*[@text='CANCELAR']")
    private WebElement btnAlertCancelar;

    @AndroidFindBy(xpath = "//*[@text='OK']")
    private WebElement btnAlertOK;

}

