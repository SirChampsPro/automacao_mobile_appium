package org.automacao.mobile.appium;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org/automacao/mobile/appium")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.automacao.mobile.appium")
public class CucumberTest {
}
