import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.browser = "chrome";
        Selenide.open("https://ru.selenide.org/");
    }

    @AfterAll
    static void tearDown() {
        closeWebDriver();
    }
}
