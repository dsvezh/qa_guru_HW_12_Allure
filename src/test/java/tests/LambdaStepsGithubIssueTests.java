package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class LambdaStepsGithubIssueTests {

    @Test
    @DisplayName("Проверка Issue при помощи Lambda шагов")
    @Owner("DaniilSvezhov")
    @Severity(SeverityLevel.NORMAL)
    void verifyIssueTitleLambdaTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        TestData testData = new TestData();

        step("Открываем главную страницу", () -> {
            open(testData.baseUrl);
        });

        step("Вводим значение репозитория", () -> {
            $(".search-input").click();
            $("#query-builder-test").setValue(testData.repoName)
                                             .pressEnter();
        });
        step("Кликаем по табу Issue", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем, что заголовок содержит имя issue", () -> {
            $("#issue_1_link").shouldHave(text(testData.issueName));
        });
    }
}
