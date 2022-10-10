package com.step.aqa.framework.example.page.element.login;

import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Link;

@Element(elementName = "Recover password element")
public class RecoverPasswordElement extends Link {

    public RecoverPasswordElement(String elementSelector) {
        super(elementSelector);
    }

}
