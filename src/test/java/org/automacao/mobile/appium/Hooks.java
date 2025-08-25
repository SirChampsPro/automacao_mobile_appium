package org.automacao.mobile.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hooks {

    private static AppiumDriverLocalService server;
    private static AppiumDriver driver;

    @BeforeAll
    public static void setupServer() {

        log.info("Iniciando servidor do appium");

        server = new AppiumServiceBuilder().usingPort(4723).withArgument(() -> "--base-path", "/").build();
        server.start();

    }

    @AfterAll
    public static void tearDown(){

        log.info("Encerrando servidor do appium");

        if(server != null) server.stop();
        server = null;

    }

    @Before
    public void setupDriver(){

        log.info("Iniciando o driver");
        driver = AppiumDriverHelper.getDriver();

    }

    @After
    public void TearDownDriver(){

        if (driver != null) driver.quit();
        driver = null;

    }

    public static AppiumDriver getDriver(){
        return driver;
    }
}
