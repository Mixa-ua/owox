package owox.rozetka;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CategoryMobilePhones {

    @Test
    public void HeaderCheck() {
        open("https://rozetka.com.ua/mobile-phones/c80003/");
        $(By.tagName("h1")).shouldHave(Condition.text("Мобильные телефоны"));
    }
}
