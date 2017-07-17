package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click login button");
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("I navigate to the login page\n");
        System.out.println(base.stepInfo);
    }


    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("I should see the userform page");
    }


    @And("^I entered the following for Login$")
    public void iEnteredTheFollowingForLogin(DataTable table) throws Throwable {


        //List<List<String>> data = table.raw();

/*
        System.out.println("The value is :"+data.get(0).get(0));
        System.out.println("The value is :"+data.get(0).get(1));
        System.out.println("The value is :"+data.get(1).get(0));
        System.out.println("The value is :"+data.get(1).get(1));*/

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user : users) {
            System.out.println("The Username is " + user.username);
            System.out.println("The Password is " + user.password);
        }

    }

    @And("^I entered ([^\"]*) and ([^\"]*)$")
    public void iEnteredUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("Username is : " + userName);
        System.out.println("Password is : " + password);
    }

    @And("^I enter the user email address as Email:([^\"]*)$")
    public void iEnterTheUserEmailAddressAsEmailAdmin(String email) throws Throwable {

        System.out.println("The email adress is : " + email);

    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }

}
