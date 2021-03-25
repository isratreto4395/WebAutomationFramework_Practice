package homepagetest1;

import common.WebAPI;
import homepage2.BestSeller;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestSellertest extends WebAPI {

    BestSeller bestsell;

    @BeforeMethod
    public void init(){
        bestsell = PageFactory.initElements(driver,BestSeller.class);
    }

    @Test
    public void bestSellerTest(){
        bestsell.bestSeller();
        String expectedText ="Amazon Best Sellers";
        String actualText = getTextById("zg_banner_text_wrapper");
        Assert.assertEquals(actualText,expectedText,"Text did not match :(");
    }



}
