import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;

import static com.codeborne.selenide.Selenide.*;

public class FindImage {
    Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
    Data getData = new Data();
    @Test
    public void findImage(){
        open(getData.getURL);
        $x("//div[@class='TkpKu']//button[@class='r7Rbd jpBZ0']")
                .click();
        $x("//div[@class='GD3rC mNDtF ktOwB']//input[@class='ctM_F gdt34']")
                .sendKeys(getData.imagePath);
        actions()
                .keyDown(Keys.SHIFT)
                .sendKeys(Keys.ARROW_UP)
                .keyUp(Keys.SHIFT)
                .keyDown(cmdCtrl)
                .sendKeys("xv")
                .keyUp(cmdCtrl)
                .perform();
        $x("//div[@class='Aa1sS j8AIa xNKUO dvBHu oh0KJ']//h1[@class='dvBHu oh0KJ']")
                .shouldBe(Condition.exactText("Visual search"));
    }
}
