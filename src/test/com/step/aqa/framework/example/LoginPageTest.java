package com.step.aqa.framework.example;

import com.codeborne.selenide.WebDriverRunner;
import com.step.aqa.framework.example.service.LoginPageService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest {

    private LoginPageService loginPageService = new LoginPageService();

    @BeforeEach
    public void openSite() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        open("https://logbook.itstep.org/login/index#/");
    }

    @Test
    public void loginVerify () throws InterruptedException {
        loginPageService.getLoginPage().getLoginFormBlock().getLoginFieldElement().elementSelector.setValue("login");
        loginPageService.getLoginPage().getLoginFormBlock().getPasswordFieldElement().elementSelector.setValue("password");
        loginPageService.getLoginPage().getLoginFormBlock().getLoginButtonElement().elementSelector.click();
        Thread.sleep(1000);
        Assertions.assertEquals("https://logbook.itstep.org/#/", WebDriverRunner.url());
    }
}
