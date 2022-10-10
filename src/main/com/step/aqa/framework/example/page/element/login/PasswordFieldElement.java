package com.step.aqa.framework.example.page.element.login;

import com.step.aqa.framework.example.annatation.Element;
import com.step.aqa.framework.example.page.element.Input;

@Element(elementName = "Password field element")
public class PasswordFieldElement extends Input {
    public PasswordFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
