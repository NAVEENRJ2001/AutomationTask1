package TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BaseClass;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/java/FeatureFile",
dryRun = false, 
glue = {"StepDefinition","hooks"}, 
tags = "@test",
plugin ={
		"pretty", "html:target/html/report.html" },
monochrome=false,
snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(Cucumber.class)


public class TestRunner extends BaseClass{
	
	@BeforeClass
	public static void startUp() {
		driver = BaseClass.browserLaunch();
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void end() {
		driver.quit();

	}

}
