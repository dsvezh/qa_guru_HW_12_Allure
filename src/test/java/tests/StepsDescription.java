package tests;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class StepsDescription {

    TestData testData = new TestData();

    @Step("Открываем главную страницу")
    public void openPage() {
        open(testData.baseUrl);
    }

    @Step("Вводим значение репозитория")
    public void setSearchInputValue() {
        $(".search-input").click();
        $("#query-builder-test").setValue(testData.repoName).pressEnter();
    }

    @Step("Кликаем по табу Issue")
    public void clickIssueTab() {
        $("#issues-tab").click();
    }


    @Step("Проверяем, что заголовок содержит имя issue")
    public void verifyIssueTitle() {
        $("#issue_1_link").shouldHave(text(testData.issueName));
    }
}
