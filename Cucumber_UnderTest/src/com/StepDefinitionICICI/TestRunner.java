package com.StepDefinitionICICI;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="ICICI Bank",glue="com.ICICIBank_Links")

public class TestRunner {

}