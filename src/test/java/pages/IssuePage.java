package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IssuePage {

    TestData testData = new TestData();

    SelenideElement issueRepo = $("#issue_1_link");

    public IssuePage verifyIssueTitle() {
        issueRepo.shouldHave(text(testData.issueName));
        return this;
    }
}
