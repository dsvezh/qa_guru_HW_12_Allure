package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RepositoryPage {

    SelenideElement issueTab = $("#issues-tab");


    public RepositoryPage clickIssueTab() {
        issueTab.click();
        return this;
    }
}
