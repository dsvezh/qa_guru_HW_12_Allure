package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubPage {

    TestData testData = new TestData();
    SelenideElement searchInput = $(".search-input"),
                    searchCombobox = $("#query-builder-test");



    public GithubPage openPage() {
        open(testData.baseUrl);
        return this;
    }

    public GithubPage setSearchInputValue() {
        searchInput.click();
        searchCombobox.setValue(testData.repoName)
                      .pressEnter();
        return this;
    }


}