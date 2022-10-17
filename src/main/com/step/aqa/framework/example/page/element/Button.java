package com.step.aqa.framework.example.page.element;

import com.codeborne.selenide.SelenideElement;
import com.step.aqa.framework.example.annatation.Element;
import org.openqa.selenium.WebElement;

@Element(elementName = "Button root element")
public class Button extends BaseElement {

    public Button(SelenideElement elementSelector) {
        super.elementSelector = elementSelector;
    }

}
