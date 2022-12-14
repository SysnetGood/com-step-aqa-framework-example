package com.step.aqa.framework.example.service;

import com.step.aqa.framework.example.annatation.Service;
import com.step.aqa.framework.example.page.SchedulePage;
import com.step.aqa.framework.example.service.service_interface.HasSchedulePage;

@Service(serviceName = "Schedule page service")
public class SchedulePageService extends BaseService implements HasSchedulePage {

    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePage() {
        return schedulePage;
    }
}
