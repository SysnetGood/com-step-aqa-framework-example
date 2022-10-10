package com.step.aqa.framework.example.page.block_interface.login;

import com.step.aqa.framework.example.page.element.login.RecoverPasswordElement;

public interface HasRecoverPasswordElement {

    RecoverPasswordElement getRecoverPasswordElement();

    default void showRecoverPasswordElementSelector () {
        System.out.println(getRecoverPasswordElement().elementSelector);
    }
}
