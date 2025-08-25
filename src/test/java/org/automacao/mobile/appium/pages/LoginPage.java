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
public class LoginPage {

    public void validatePage(){
        new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(Constants.TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@resource-id='yourUsername']")));
    }

    @AndroidFindBy(xpath = "//*[@resource-id='yourUsername']")
    private WebElement user;

    @AndroidFindBy(xpath = "//*[@resource-id='yourPassword']")
    private WebElement passwd;

    @AndroidFindBy(xpath = "//*[@resource-id='logginButton']")
    private WebElement btnLogin;

}
