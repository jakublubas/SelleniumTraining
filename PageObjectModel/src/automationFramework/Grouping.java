package automationFramework;
import org.testng.annotations.Test;

public class Grouping {
    @Test (priority = 0, enabled = true)
    public void Car1(){
        System.out.println("Batch Car - Test car 1");
    }

    @Test (priority = 1)
    public void Car2(){
        System.out.println("Batch Car - Test car 2");
    }

    @Test (priority = 2)
    public void  Scooter1(){
        System.out.println("Batch Scooter - Test scooter 1");
    }

    @Test (priority = 0)
    public void  Scooter2(){
        System.out.println("Batch Scooter - Test scooter 2");
    }

    @Test (priority = 0)
    public void  Sedan1(){
        System.out.println("Batch Sedan Car - Test sedan 1");
    }
}
