package addingtocarttest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static addingtocarttest.AddingToCartWebElement.*;

public class AddingToCart extends WebAPI {
    HomePage homepage = new HomePage();

//    @FindBy(how = How.ID, using = searchBoxLocator)
//    public WebElement searchBox;
//    @FindBy(how = How.ID, using = searchButtonLocator)
//    public WebElement searchButton;
//


    @FindBy(id = searchBoxLocator)
    public WebElement searchBox;

    @FindBy(id = searchButtonLocator)
    public WebElement searchButton;

    @FindBy(css = hijabLocate)
    public WebElement hijabLocator;

    @FindBy(xpath = addToCart)
    public WebElement addingToCart;

    @FindBy(linkText = cart)
    public WebElement checkingCart;

    public void checkSearchBox() {
        //homepage.amazonLogIn();
        searchBox.sendKeys(productName);
        searchButton.click();
    }

    public void locateSearchElement() {
        checkSearchBox();
        hijabLocator.click();
    }

    public void addingElementToCart() {
        locateSearchElement();
        addingToCart.click();
    }

    public void checkingTheCart() {
        addingElementToCart();
        checkingCart.click();
    }














}
