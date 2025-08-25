package org.automacao.mobile.appium.pages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.automacao.mobile.appium.Constants;
import org.automacao.mobile.appium.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Getter
@NoArgsConstructor
public class HomePage {

    public void validatePage(){
        new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(Constants.TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Dashboard'][1]")));
    }
}
