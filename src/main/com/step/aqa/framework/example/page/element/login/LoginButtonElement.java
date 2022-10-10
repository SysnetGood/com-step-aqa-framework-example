package com.step.aqa.framework.example.page.element.login;

import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Button;

@Element(elementName = "Login button element")
public class LoginButtonElement extends Button {

    public LoginButtonElement(String elementSelector) {
        super(elementSelector);
    }
}
