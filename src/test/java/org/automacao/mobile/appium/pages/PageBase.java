package org.automacao.mobile.appium.pages;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.messages.types.Hook;
import org.automacao.mobile.appium.Constants;
import org.automacao.mobile.appium.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class PageBase {

    public void sendKeys(WebElement element, String value){
        element.sendKeys(value);
        delay(Constants.SEND_KEYS_DELAY_IN_MILLISECONDS);
    }

    public void delay(){
        delay(Constants.DEFAULT_DELAY_IN_MILLISECONDS);
    }


    public void hideKeyboard() {
        if (Hooks.getDriver() instanceof AndroidDriver) {
            ((AndroidDriver) Hooks.getDriver()).hideKeyboard();
        } else if (Hooks.getDriver() instanceof IOSDriver) {
            ((IOSDriver) Hooks.getDriver()).hideKeyboard();
        }
    }

    public void swipeVertical(){

        Dimension size = Hooks.getDriver().manage().window().getSize();
        int startY = (int)(size.height * 0.5);
        int endY = (int)(size.height * 0.2);
        int startX = (int)(size.width / 2);
        int endX = (int)(size.width / 2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        // Move o "dedo" até o ponto inicial
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));

        // Pressiona a tela
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        // Arrasta até o ponto final com duração de 2 segundos
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(2), PointerInput.Origin.viewport(), endX, endY));

        // Solta o "dedo"
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Executa o gesto no driver
        Hooks.getDriver().perform(Collections.singletonList(swipe));

    }

    public void swipeHorizontal(){

        Dimension size = Hooks.getDriver().manage().window().getSize();
        int startY = (int)(size.height /2);
        int endY = (int)(size.height /2);
        int startX = (int)(size.width * 0.5);
        int endX = (int)(size.width * 0.2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        // Move o "dedo" até o ponto inicial
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));

        // Pressiona a tela
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        // Arrasta até o ponto final com duração de 2 segundos
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(2), PointerInput.Origin.viewport(), endX, endY));

        // Solta o "dedo"
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Executa o gesto no driver
        Hooks.getDriver().perform(Collections.singletonList(swipe));

    }

    public void delay(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void validateElementPresence(String xpath){

        new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(Constants.TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(xpath)));

    }

}

