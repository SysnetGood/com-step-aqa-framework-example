package com.step.aqa.framework.example.page.element;

import com.step.aqa.framework.example.annatation.Element;

@Element(elementName = "Button root element")
public class Button extends BaseElement {

    public Button(String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
