package com.step.aqa.framework.example.page.element.login;

import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Input;

@Element(elementName = "Login field element")
public class LoginFieldElement extends Input {

    public LoginFieldElement(String elementSelector) {
        super(elementSelector);
    }

}
