package com.step.aqa.framework.example.page.element.login;

import com.codeborne.selenide.SelenideElement;
import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Button;
import org.openqa.selenium.WebElement;

@Element(elementName = "Login button element")
public class LoginButtonElement extends Button {

    public LoginButtonElement(SelenideElement elementSelector) {
        super(elementSelector);
    }
}
