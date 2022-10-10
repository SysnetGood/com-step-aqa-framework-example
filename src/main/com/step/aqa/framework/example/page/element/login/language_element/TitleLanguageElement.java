package com.step.aqa.framework.example.page.element.login.language_element;

import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Label;

@Element(elementName = "Title language element")
public class TitleLanguageElement extends Label {

    public TitleLanguageElement(String elementSelector) {
        super(elementSelector);
    }

}
