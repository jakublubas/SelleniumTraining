package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil {


    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser");

        base.stepInfo = "FirefoxDriver";

    }

    @After
    public void TerDownTest(Scenario scenario){

        if (scenario.isFailed()){
            //Take screenshoot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser");
        System.out.println(scenario.getName());
    }
}
