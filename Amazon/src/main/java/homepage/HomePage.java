package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = signinAccountLocator)
    public WebElement signinAccount;

    @FindBy(how = How.NAME, using = userNameField)
    public WebElement username;

    @FindBy(how = How.XPATH, using = continueButton)
    public WebElement contButton;

    @FindBy(how = How.NAME, using = passwordField)
    public WebElement password;

    @FindBy(how = How.ID, using = signInSubmit)
    public WebElement signIn;

    @FindBy(how = How.ID, using = returnsAndOrdersLocator)
    public WebElement returnsAndOrdersTab;

    @FindBy(how = How.LINK_TEXT, using = customerServiceTab)
    public WebElement customerService;

    @FindBy(how = How.ID, using = primeVideoTab)
    public WebElement primeVideo;

    @FindBy(how = How.LINK_TEXT, using = primeTab)
    public WebElement prime;

    @FindBy(how = How.LINK_TEXT, using = bestSellersTab)
    public WebElement bestSellers;

    @FindBy(how = How.XPATH, using = conditionsOfUse)
    public WebElement conditionsOfUseLink;

    @FindBy(how = How.XPATH, using = privacyNotice)
    public WebElement privacyNoticeLink;

    @FindBy(how = How.XPATH, using = interestBasedAds)
    public WebElement interestBasedAdsLink;

    @FindBy(how = How.LINK_TEXT, using = careers)
    public WebElement careersLink;

    public void amazonLogIn() {
        try {
            signinAccount.click();
            username.sendKeys(loadProperties().getProperty("AmazonEmail"));
            contButton.click();
            password.sendKeys(loadProperties().getProperty("AmazonPassword"));
            signIn.click();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void returnsAndOrders() {
        returnsAndOrdersTab.click();
    }

    public void primeVideoPage() {
        primeVideo.click();
    }

    public void customerServicePage() {
        customerService.click();
    }

    public void primePage() {
        prime.click();
    }

    public void bestSellersPage() {
        bestSellers.click();
    }

    public void conditionsofUsePage() {
        conditionsOfUseLink.click();
    }

    public void privacyNoticePage() {
        privacyNoticeLink.click();
    }

    public void interestBasedAds() {
        interestBasedAdsLink.click();
    }

    public void careersPage() {
        careersLink.click();
    }


}

