package org.automacao.mobile.appium;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org/automacao/mobile/appium")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.automacao.mobile.appium")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@usuarios")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report/cucumber.html, json:target/cucumber-report/cucumber.json")
public class CucumberTest {
}

