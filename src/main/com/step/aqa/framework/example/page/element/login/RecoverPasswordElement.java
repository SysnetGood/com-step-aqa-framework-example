package com.step.aqa.framework.example.page.element.login;

import com.codeborne.selenide.SelenideElement;
import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Link;
import org.openqa.selenium.WebElement;

@Element(elementName = "Recover password element")
public class RecoverPasswordElement extends Link {

    public RecoverPasswordElement(SelenideElement elementSelector) {
        super(elementSelector);
    }

}
