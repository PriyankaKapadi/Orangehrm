package com.testingshashtra.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",
glue="com.testingshashtra.stepdefinition",
tags="@today",
dryRun=false,
plugin = {
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
})
public class FeatureRunner extends AbstractTestNGCucumberTests{

}

