package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue={"org.stepdefinition"},monochrome=true,dryRun=false,strict=true,snippets=SnippetType.CAMELCASE
,tags= {"@Reg or @f12"},plugin= {"pretty","html:src\\\\test\\\\resources","json:src\\\\test\\\\resources\\Test.json","junit:src\\\\test\\\\resources\\Test.xml"})

public class TestRunner {

	

	
}
