package com.step.aqa.framework.example.page.block.login;

import com.step.aqa.framework.example.annatation.Block;
import com.step.aqa.framework.example.page.block.BaseBlock;
import com.step.aqa.framework.example.page.block_interface.login.HasLoginButtonElement;
import com.step.aqa.framework.example.page.block_interface.login.HasLoginFieldElement;
import com.step.aqa.framework.example.page.block_interface.login.HasPasswordFieldElement;
import com.step.aqa.framework.example.page.block_interface.login.HasRecoverPasswordElement;
import com.step.aqa.framework.example.page.element.login.LoginButtonElement;
import com.step.aqa.framework.example.page.element.login.LoginFieldElement;
import com.step.aqa.framework.example.page.element.login.PasswordFieldElement;
import com.step.aqa.framework.example.page.element.login.RecoverPasswordElement;

@Block(blockName = "Login form block")
public class LoginFormBlock extends BaseBlock implements HasLoginButtonElement, HasLoginFieldElement, HasPasswordFieldElement, HasRecoverPasswordElement {

    private LoginButtonElement loginButtonElement = new LoginButtonElement("selector for Login Button");
    private LoginFieldElement loginFieldElement = new LoginFieldElement("selector for Login input");
    private PasswordFieldElement passwordFieldElement = new PasswordFieldElement("selector for Password input");
    private RecoverPasswordElement recoverPasswordElement = new RecoverPasswordElement("selector for recover link");

    @Override
    public LoginButtonElement getLoginButtonElement() {
        return loginButtonElement;
    }

    @Override
    public LoginFieldElement getLoginFieldElement() {
        return loginFieldElement;
    }

    @Override
    public PasswordFieldElement getPasswordFieldElement() {
        return passwordFieldElement;
    }

    @Override
    public RecoverPasswordElement getRecoverPasswordElement() {
        return recoverPasswordElement;
    }
}
