package com.step.aqa.framework.example.page.element.login;

import com.codeborne.selenide.SelenideElement;
import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Input;
import org.openqa.selenium.WebElement;

@Element(elementName = "Password field element")
public class PasswordFieldElement extends Input {
    public PasswordFieldElement(SelenideElement elementSelector) {
        super(elementSelector);
    }
}
