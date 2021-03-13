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

    @Test
    public void checkSearchBoxTest() {
        addToCart.checkSearchBox();
    }

    @Test
    public void locateSearchElementTest() {
        addToCart.locateSearchElement();

    }

    @Test
    public void addingElementToCartTest() {
        addToCart.addingElementToCart();
    }

    @Test
    public void checkingTheCartTest() {
        addToCart.addingElementToCart();
    }
}
