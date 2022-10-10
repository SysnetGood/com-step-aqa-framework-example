package com.step.aqa.framework.example.page.block_interface.login;

import com.step.aqa.framework.example.page.element.login.LoginButtonElement;

public interface HasLoginButtonElement {

    LoginButtonElement getLoginButtonElement();

    default void showLoginButtonElementSelector () {
        System.out.println(getLoginButtonElement().elementSelector);
    }
}
