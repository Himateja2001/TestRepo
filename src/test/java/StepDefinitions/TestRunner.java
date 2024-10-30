package StepDefinitions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"}, features = "C:\\Users\\gunth\\Documents\\TestApplication\\TestApp\\src\\test\\resources\\Features\\Login.feature", glue={"StepDefinitions"})
public class TestRunner
{

}
