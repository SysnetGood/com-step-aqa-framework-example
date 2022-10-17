package com.step.aqa.framework.example.page.element;

import com.codeborne.selenide.SelenideElement;
import com.step.aqa.framework.example.annatation.Element;
import org.openqa.selenium.WebElement;

@Element(elementName = "Link root element")
public class Link extends BaseElement {

    public Link(SelenideElement elementSelector) {
        super.elementSelector = elementSelector;
    }
}
