package com.step.aqa.framework.example.page.element;

import com.codeborne.selenide.SelenideElement;
import com.step.aqa.framework.example.annatation.Element;
import org.openqa.selenium.WebElement;

@Element(elementName = "Input root element")
public class Input extends BaseElement {

    public Input(SelenideElement elementSelector) {
        super.elementSelector = elementSelector;
    }
}
