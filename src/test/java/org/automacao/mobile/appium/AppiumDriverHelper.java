package org.automacao.mobile.appium;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

@Slf4j
public class AppiumDriverHelper {

    public static DesiredCapabilities getCapabilities(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("appium:automationName", "uiAutomator2");
        capabilities.setCapability("appium:deviceName", "d037c70");
        capabilities.setCapability("appium:ignoreHiddenApiPolicyError", true);
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);
        capabilities.setCapability("appium:newCommandTimeout", Optional.of(3600));
        capabilities.setCapability("appium:connectHardwareKeyboard", true);
        capabilities.setCapability("appium:app", System.getProperty("user.dir") + "/apk/app.apk");

        return capabilities;
    }

    public static URL getURL() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/");
    }

    public static AppiumDriver getDriver(){

        AppiumDriver driver = null;

        try {
            driver = new AppiumDriver(getURL(), getCapabilities());
        }catch (Exception e) {
            log.error("Erro ao criar driver", e);
            throw new RuntimeException(e);
        }

        return driver;
    }
}
