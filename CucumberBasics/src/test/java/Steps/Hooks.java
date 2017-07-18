package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseUtil {


    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        System.out.println("Opening the browser: CHROME");

    }

    @After
    public void TerDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            //Take screenshoot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser");
        System.out.println(scenario.getName());
    }
}
