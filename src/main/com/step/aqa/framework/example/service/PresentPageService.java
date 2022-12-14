package com.step.aqa.framework.example.service;

import com.step.aqa.framework.example.annatation.Service;
import com.step.aqa.framework.example.page.PresentPage;
import com.step.aqa.framework.example.service.service_interface.HasPresentPage;

@Service(serviceName = "Present page service")
public class PresentPageService extends BaseService implements HasPresentPage {

    private PresentPage presentPage = new PresentPage();

    @Override
    public PresentPage getPresentPage() {
        return presentPage;
    }
}
