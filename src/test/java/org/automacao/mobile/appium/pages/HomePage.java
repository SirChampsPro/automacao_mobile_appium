package org.automacao.mobile.appium.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.automacao.mobile.appium.Constants;
import org.automacao.mobile.appium.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Getter
@NoArgsConstructor
public class HomePage extends PageBase {

    public void validatePage(){
        new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(Constants.TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Dashboard'][1]")));
    }

    public void validateMenuMain(){
        validateElementPresence("//*[contains(@content-desc, 'Logout')]");
    }

    @AndroidFindBy(xpath = "//*[@resource-id='header']/android.view.View[2]/android.widget.TextView")
    private WebElement btnMenuMain;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Customers')]")
    private WebElement btnMenuCustomers;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Products')]")
    private WebElement btnMenuProducts;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Stocks')]")
    private WebElement btnMenuStocks;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Orders')]")
    private WebElement btnMenuOrders;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Users')]")
    private WebElement btnMenuUsers;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Logout')]")
    private WebElement btnMenuLogout;

}
