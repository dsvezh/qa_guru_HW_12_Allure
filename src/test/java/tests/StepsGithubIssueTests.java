package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StepsGithubIssueTests {

    @Test
    @DisplayName("Проверка Issue при помощи Annotated шагов")
    @Owner("VS")
    @Severity(SeverityLevel.NORMAL)
    public void verifyIssueTitleAnnotatedTest(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        StepsDescription step = new StepsDescription();

        step.openPage();
        step.setSearchInputValue();
        step.clickIssueTab();
        step.verifyIssueTitle();
    }
}
