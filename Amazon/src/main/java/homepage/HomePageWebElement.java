package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageWebElement {
    public JavascriptExecutor jscript;
    public static final String amazonUrl="https://www.amazon.com/";
    public static final String logoPath = "nav-logo-sprites";
    public static final String signinAccountLocator = "//*[@id='nav-link-accountList']";
    public static final String userNameField = "email";
    public static final String continueButton = "//*[@id=\"continue\"]";
    public static final String passwordField = "password";
    public static final String signInSubmit ="signInSubmit";
    public static final String selectYourAddressLocator = "nav-global-location-popover-link";
    //public static final String zipCodeBox = "GLUXZipUpdateInput";
    //public static final String zipCodeBox="GLUXZipInputSection";
    //public static final String zipCodeBox = "GLUX_Full_Width a-declarative";
    //public static final String zipCodeBox = "#GLUXZipUpdateInput";
    //public static final String zipCodeBox = "//*[@id=\"GLUXZipUpdateInput\"]";
    //public static final String zipCodeBox = "a-column a-span8";
    //public static final String zipCodeBox = "#GLUXZipInputSection > div.a-column.a-span8";
    //public static final String zipCodeBox = "input[id*='GLUXZipUpdateInput']";
    //public static final String zipCodeBox = "//*[@id=\"GLUXZipUpdateInput\"]";
    public static final String zipCodeBox = "//*[@id='GLUXZipUpdateInput']";
    public static final String zipCode = "53224";
    public static final String applyButton = "//*[@id=\"GLUXZipUpdate\"]/span/input";
    public static final String doneButton = "//*[@id=\"a-popover-3\"]/div/div[2]/span/span/span/button";
    public static final String returnsAndOrdersLocator = "nav-orders";
    public static final String customerServiceTab = "Customer Service";
    public static final String primeTab = "Prime";
    public static final String primeVideoTab ="Prime Video";
    public static final String bestSellersTab = "Best Sellers";
    public static final String conditionsOfUse = "//a[text()='Conditions of Use']";
    public static final String privacyNotice = "//a[text()='Privacy notice']";
    public static final String interestBasedAds = "//a[text()='Interest-Based Ads']";
    public static final String careers = "Careers";
    public static final String searchBoxLocator="twotabsearchtextbox";
    public static final String searchButtonLocator="nav-search-submit-button";
    public static final String productName = "hijab";


}
