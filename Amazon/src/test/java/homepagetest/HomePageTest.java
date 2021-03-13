package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {

    HomePage homepage;


    @BeforeMethod
    public void initialization() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void amazonLogInTest() {
        homepage.amazonLogIn();
    }

    //    @Test(groups = {"sample"})
    @Test
    public void returnsAndOrdersTest() {
        homepage.returnsAndOrders();
    }


//    @Test(groups = { "functest", "checkintest" })

    @Test
    public void conditionsOfUsePageTest() {
        homepage.conditionsofUsePage();
    }

}
