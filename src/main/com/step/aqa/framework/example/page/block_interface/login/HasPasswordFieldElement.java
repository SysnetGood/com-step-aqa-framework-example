package com.step.aqa.framework.example.page.block_interface.login;

import com.step.aqa.framework.example.page.element.login.PasswordFieldElement;

public interface HasPasswordFieldElement {

    PasswordFieldElement getPasswordFieldElement();

    default void showPasswordFieldElementSelector () {
        System.out.println(getPasswordFieldElement().elementSelector);
    }
}
