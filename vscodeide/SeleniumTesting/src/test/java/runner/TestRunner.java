package runner;
//import org.gradle.internal.impldep.org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import pages.BasePage;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",//scenarios
                    glue="steps",//paquete donde tenemos nuestras clases steps
                    plugin = {"pretty","html:target/cucumber-reports"})
public class TestRunner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
}
