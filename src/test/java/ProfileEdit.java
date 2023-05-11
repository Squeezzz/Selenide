import com.codeborne.selenide.Condition;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

public class ProfileEdit {
    Data getData = new Data();
    @Test
    public void profileEdit(){
        open(getData.getURL);
        $x("//div[@class='r1yVH']//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L']")
                .click();
        $x("//div[@class='form-group']//input[@id='user_email']")
                .sendKeys(getData.email);
        $x("//div[@class='form-group']//input[@id='user_password']")
                .sendKeys(getData.password);
        $x("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']")
                .click();

        $x("//div[@class='TkpKu']//button[@class='ptze8 jpBZ0 uOpQU']") //profile picture click
                .click();
        $x("//ul[@class='O6hdO ruKGA oh0KJ']//a[@class='KR60y VVTRX WP6Ak eziW_ svE7J IquXd']")
                .click();
        $x("//div[@class='AW1O4']//a[@class='Z1oo6 CwMIr DQBsa p1cWU jpBZ0 EzsBC KHq0c Olora I0aPD dEcXu']")
                .click();
        $x("//div[@class='form-group']//input[@class='form-control']")
                .clear();
        $x("//div[@class='form-group']//input[@class='form-control']")
                .sendKeys(getData.editedFirstName);
        $x("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']")
                .click();
        $x("//div[@class='row']//div[@class='col-xs-10 col-sm-6 center-block flash__message']")
                .shouldBe(Condition.exactText("Account updated!"));


    }

}
