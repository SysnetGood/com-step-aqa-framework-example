package com.step.aqa.framework.example.page.element;

import com.step.aqa.framework.example.annatation.Element;

@Element(elementName = "Label root element")
public class Label extends BaseElement {

    public Label(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
