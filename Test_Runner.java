package test_runner;

	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"./featureFile/feature_file.feature"},monochrome = true)
	public class Test_Runner {

	}
