package com.testingshashtra.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//orangehrm.feature",
glue="com.testingshastra.stepdefinition")
public class FeatureRunner extends AbstractTestNGCucumberTests{

}

