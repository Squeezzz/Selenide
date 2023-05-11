import org.junit.Test;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Registration {
    Data getData = new Data();
    @Test
    public void authorization(){
        open(getData.getURL);
        $x("//div[@class='r1yVH']//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L']")
                .click();
        $x("//div[@class='login__alt-cta text-center']//a[text()='Join Unsplash']")
                .click();

        $x("//div[@class='form-group']//input[@id='user_first_name']")
                .sendKeys(getData.firstName);
        $x("//div[@class='form-group']//input[@id='user_last_name']")
                .sendKeys(getData.lastName);
        $x("//div[@class='form-group']//input[@id='user_email']")
                .sendKeys(getData.email);
        $x("//div[@class='form-group']//input[@id='user_username']")
                .sendKeys(getData.userName);
        $x("//div[@class='form-group']//input[@id='user_password']")
                .sendKeys(getData.password);
        $x("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']")
                .click();
    }

}
