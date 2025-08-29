package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.FeatureFileGenerator;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/temp",
    glue = "steps",
    plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class TempFeatureRunner {

    @BeforeClass
    public static void generateFeatureFile() throws Exception {
        FeatureFileGenerator.generate();  // Create the feature file before test runs
    }
}