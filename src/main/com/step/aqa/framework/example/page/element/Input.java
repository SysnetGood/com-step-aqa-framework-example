package com.step.aqa.framework.example.page.element;

import com.step.aqa.framework.example.annatation.Element;

@Element(elementName = "Input root element")
public class Input extends BaseElement {

    public Input(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
