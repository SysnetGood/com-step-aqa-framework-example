package com.step.aqa.framework.example.page.element;

import com.step.aqa.framework.example.annatation.Element;

@Element(elementName = "Link root element")
public class Link extends BaseElement {

    public Link(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
