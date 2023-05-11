import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class Authorization {
    Data getData = new Data();
    @Test
    public void authorization(){
        open(getData.getURL);
        $x("//div[@class='r1yVH']//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L']")
                .click();
        $x("//div[@class='form-group']//input[@id='user_email']")
                .sendKeys(getData.email);
        $x("//div[@class='form-group']//input[@id='user_password']")
                .sendKeys(getData.password);
        $x("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']")
                .click();
    }

    @Test
    public void negativeAuthorization(){
        open(getData.getURL);
        $x("//div[@class='r1yVH']//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L']")
                .click();
        $x("//div[@class='form-group']//input[@id='user_email']")
                .sendKeys(getData.wrongEmail);
        $x("//div[@class='form-group']//input[@id='user_password']")
                .sendKeys(getData.password);
        $x("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']")
                .click();
        $x("//div[@class='flash flash--alert animated js-flash js-flash-alert']//div[@class='row']//div[@class='col-xs-10 col-sm-6 center-block flash__message']")
                .shouldBe(Condition.exactText("Invalid email or password."));
    }

}
