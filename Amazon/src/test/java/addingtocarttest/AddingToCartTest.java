package addingtocarttest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingToCartTest extends WebAPI {

    AddingToCart addToCart;

    @BeforeMethod
    public void initialization() {
        addToCart = PageFactory.initElements(driver, AddingToCart.class);
    }

    @Test(priority = 1)
    public void checkSearchBoxTest() {
        addToCart.checkSearchBox();
    }

    @Test(priority = 2)
    public void locateSearchElementTest() {
        addToCart.locateSearchElement();

    }

    @Test(priority = 3)
    public void addingElementToCartTest() {
        addToCart.addingElementToCart();
    }

    @Test(priority = 4)
    public void checkingTheCartTest() {
        addToCart.addingElementToCart();
    }
}
