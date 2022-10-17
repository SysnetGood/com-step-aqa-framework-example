package com.step.aqa.framework.example.page.element.login.language_element;

import com.codeborne.selenide.SelenideElement;
import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Label;
import org.openqa.selenium.WebElement;

@Element(elementName = "Title language element")
public class TitleLanguageElement extends Label {

    public TitleLanguageElement(SelenideElement elementSelector) {
        super(elementSelector);
    }

}
