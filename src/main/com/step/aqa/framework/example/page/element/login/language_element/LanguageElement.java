package com.step.aqa.framework.example.page.element.login.language_element;

import com.codeborne.selenide.SelenideElement;
import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Link;
import org.openqa.selenium.WebElement;

@Element(elementName = "Language element")
public class LanguageElement extends Link {

    public LanguageElement(SelenideElement elementSelector) {
        super(elementSelector);
    }

}
