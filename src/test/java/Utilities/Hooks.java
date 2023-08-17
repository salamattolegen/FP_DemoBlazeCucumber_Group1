package Utilities;

import Utilities.BaseDriverDemoBlaze;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void afterScenario(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] byteImage=((TakesScreenshot) BaseDriverDemoBlaze.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
        }
    }

}