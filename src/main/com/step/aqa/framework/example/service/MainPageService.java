package com.step.aqa.framework.example.service;

import com.step.aqa.framework.example.annatation.Service;
import com.step.aqa.framework.example.page.MainPage;
import com.step.aqa.framework.example.service.service_interface.HasMainPage;

@Service(serviceName = "Main page service")
public class MainPageService extends BaseService implements HasMainPage {

    private MainPage mainPage = new MainPage();

    @Override
    public MainPage getMainPage() {
        return mainPage;
    }
}
