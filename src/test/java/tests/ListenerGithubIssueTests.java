package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GithubPage;
import pages.IssuePage;
import pages.RepositoryPage;

public class ListenerGithubIssueTests {

    GithubPage githubPage = new GithubPage();
    RepositoryPage repositoryPage = new RepositoryPage();
    IssuePage issuePage = new IssuePage();

    @Test
    @DisplayName("Проверка названия Issue")
    @Owner("DaniilSvezhov")
    @Severity(SeverityLevel.NORMAL)
    void verifyIssueTitleSelenideTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        githubPage.openPage()
                  .setSearchInputValue();
        repositoryPage.clickIssueTab();
        issuePage.verifyIssueTitle();

    }
}
