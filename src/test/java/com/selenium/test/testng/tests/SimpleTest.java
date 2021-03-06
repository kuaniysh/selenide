package com.selenium.test.testng.tests;

import com.codeborne.selenide.SelenideElement;
import com.selenium.test.junit.rules.ScreenShotOnFailRule;
import com.selenium.test.testng.listeners.ScreenShotOnFailListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sidelnikov Mikhail on 30.07.15.
 * Uses TestNG test framework
 * Test demonstrates simple Selenide functions : how to start browser, open url, insert some text and check that this text was inserted
 * For more information about Selenide visit <a href="http://selenide.org">Selenide</a>
 */
@Listeners({ScreenShotOnFailListener.class})
public class SimpleTest {

    @Test
    public void testFillGoogleForm() {
        System.out.println("SSS");
       /* String toSearch = "Selenium";
        open("http://www.youtube.com");
        SelenideElement searchString  = $("#masthead-search-term");
        searchString.sendKeys(toSearch);
        $("#masthead-search-term").shouldHave(value(toSearch));*/
    }
}
