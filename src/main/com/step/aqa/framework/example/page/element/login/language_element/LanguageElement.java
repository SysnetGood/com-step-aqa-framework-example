package com.step.aqa.framework.example.page.element.login.language_element;

import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Link;

@Element(elementName = "Language element")
public class LanguageElement extends Link {

    public LanguageElement(String elementSelector) {
        super(elementSelector);
    }

}
