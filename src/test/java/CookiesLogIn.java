import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Selenide.*;

public class CookiesLogIn {
    Data getData = new Data();

    @Test
    public void cookiesLogIn() {
        Cookie getCookie = new Cookie("un_sesh", "SEFFWENwa0pQWTZIZ1RNZUpqdkVyczdQT0V6OTNxdVR2WWF3OThGNmxJRTFRNU9zUElNZ1gyV0ZNbW5rakZ4ZVZEQ1l0QjdtSEZUQUR5c3VvUysxWEcxaGNZTGhMSUNjbUJ2b0s5YmtHaTNTQkRlZm9mZCtHZkdiUjVsTHNtV1hlSFduNUo2OUpLK3B1dkZrNmpmL3N4UDJEZzJpS2thRVVrNmcyUlpMdDUxVnlhTHhuMHpSUGtWcHF3aStwK0dmMUtOY3NNUEJZeTBLLzNFUDlOcDRvNmtRRytTd1pVR3B2WTZLMk1GRFhhbWk4N0tYYXp5eU5UdkdwajZaL2M1d2ZDcTNkRjA0VlBZZFlJeC95U1l2VEdJUHBQU0I1TFA2M3BKZVJScytuZ2dydVVuMVlkZjZ5THNNWHFDSEJCWWhVaHlFejZ1b0NZd3N5NStmeXhLaDZBRkhBenBpaFMvcVdIOUVlcy84YTIrRFc0bGF6cmdkQk5iTU1xZUxxWmphUmU0VUFpNGlhZEd6ejJRdE9CV0ZKVUtxa1BsNEI2My8vVkw3YTVhNHNqNnRCSE16WWZaWGd5Y1h1YWNPVHM0QUlRb1lpQnZuWTNLR2c4WXZmTUhNaUw4eGxnSWNqZUlTeDBXUFpQS1RnU1E9LS1jcUJkVTF3Q0RxKzBOQ2RTdC9KVzZRPT0%3D--3aecc32ff07c39052599f38890df9107bd54bd63");
        open(getData.getURL);
        WebDriverRunner.getWebDriver().manage().addCookie(getCookie);
        $x("//div[@class='r1yVH']//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L']")
                .click();
        open(getData.profileURL);
    }
}