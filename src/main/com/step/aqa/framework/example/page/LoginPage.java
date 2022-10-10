package com.step.aqa.framework.example.page;

import com.step.aqa.framework.example.annatation.Page;
import com.step.aqa.framework.example.page.block.login.LanguageBlock;
import com.step.aqa.framework.example.page.block.login.LoginFormBlock;
import com.step.aqa.framework.example.page.page_interface.login.HasLanguageBlock;
import com.step.aqa.framework.example.page.page_interface.login.HasLoginFormBlock;

@Page(pageName = "Login page")
public class LoginPage extends BasePage implements HasLanguageBlock, HasLoginFormBlock {

    private LanguageBlock languageBlock = new LanguageBlock();
    private LoginFormBlock loginFormBlock = new LoginFormBlock();

    @Override
    public LanguageBlock getLanguageBlock() {
        return languageBlock;
    }

    @Override
    public LoginFormBlock getLoginFormBlock() {
        return loginFormBlock;
    }
}
