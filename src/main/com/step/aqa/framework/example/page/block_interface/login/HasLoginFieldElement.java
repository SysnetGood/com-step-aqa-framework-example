package com.step.aqa.framework.example.page.block_interface.login;

import com.step.aqa.framework.example.page.element.login.LoginFieldElement;

public interface HasLoginFieldElement {

    LoginFieldElement getLoginFieldElement();

    default void showLoginFieldElementSelector () {
        System.out.println(getLoginFieldElement().elementSelector);
    }
}
