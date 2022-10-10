package com.step.aqa.framework.example.service;

import com.step.aqa.framework.example.annatation.Service;
import com.step.aqa.framework.example.page.LoginPage;
import com.step.aqa.framework.example.service.service_interface.HasLoginPage;

@Service(serviceName = "Login page service")
public class LoginPageService extends BaseService implements HasLoginPage {

    private LoginPage loginPage = new LoginPage();

    @Override
    public LoginPage getLoginPage() {
        return loginPage;
    }
}
