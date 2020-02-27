import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;

@ExtendWith(SoftAssertsExtension.class)
public class Tests extends TestBase {

    @BeforeEach
    void preCondition() {
        //Configuration.assertionMode = SOFT;
        $(By.linkText("С чего начать?")).click();
    }

    @Test
    @DisplayName("This test should be passed")
    void test2() {
        Configuration.assertionMode = SOFT;
        $(".wrapper-color-content > h3").shouldBe(visible);
        back();
    }


    @Test
    @DisplayName("This test should be failed")
    void test1() {
        Configuration.assertionMode = SOFT;
        $(".wrapper-color-content > h3").shouldBe(not(visible));
        back();
    }
}
