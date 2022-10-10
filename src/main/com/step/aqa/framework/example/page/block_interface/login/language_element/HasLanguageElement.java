package com.step.aqa.framework.example.page.block_interface.login.language_element;

import com.step.aqa.framework.example.page.element.login.language_element.LanguageElement;

public interface HasLanguageElement {

    LanguageElement getLanguageElement();

    default void showLanguageElementSelector () {
        System.out.println(getLanguageElement().elementSelector);
    }
}
