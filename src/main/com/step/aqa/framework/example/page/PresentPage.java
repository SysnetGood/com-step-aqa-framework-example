package com.step.aqa.framework.example.page;

import com.step.aqa.framework.example.annatation.Page;
import com.step.aqa.framework.example.page.block.TopMenuBlock;
import com.step.aqa.framework.example.page.block.left_menu.FooterLeftMenuBlock;
import com.step.aqa.framework.example.page.block.left_menu.HeaderLeftMenuBlock;
import com.step.aqa.framework.example.page.block.left_menu.NavigationLeftMenuBlock;
import com.step.aqa.framework.example.page.block.present.HeaderBlock;
import com.step.aqa.framework.example.page.block.present.MaterialInformationBlock;
import com.step.aqa.framework.example.page.block.present.NavigationBlock;
import com.step.aqa.framework.example.page.block.present.StudentTableBlock;
import com.step.aqa.framework.example.page.page_interface.HasTopMenuBlock;
import com.step.aqa.framework.example.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import com.step.aqa.framework.example.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import com.step.aqa.framework.example.page.page_interface.left_menu.HasNavigationLeftMenuBlock;
import com.step.aqa.framework.example.page.page_interface.present.HasHeaderBlock;
import com.step.aqa.framework.example.page.page_interface.present.HasMaterialInformationBlock;
import com.step.aqa.framework.example.page.page_interface.present.HasNavigationBlock;
import com.step.aqa.framework.example.page.page_interface.present.HasStudentTableBlock;

@Page(pageName = "Page page")
public class PresentPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock, HasNavigationLeftMenuBlock,
        HasHeaderBlock, HasMaterialInformationBlock, HasNavigationBlock, HasStudentTableBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private HeaderBlock headerBlock = new HeaderBlock();
    private MaterialInformationBlock materialInformationBlock = new MaterialInformationBlock();
    private NavigationBlock navigationBlock = new NavigationBlock();
    private StudentTableBlock studentTableBlock = new StudentTableBlock();


    @Override
    public TopMenuBlock getTopMenuBlock() {
        return topMenuBlock;
    }

    @Override
    public FooterLeftMenuBlock getFooterLeftMenuBlock() {
        return footerLeftMenuBlock;
    }

    @Override
    public HeaderLeftMenuBlock getHeaderLeftMenuBlock() {
        return headerLeftMenuBlock;
    }

    @Override
    public NavigationLeftMenuBlock getNavigationLeftMenuBlock() {
        return navigationLeftMenuBlock;
    }

    @Override
    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }

    @Override
    public MaterialInformationBlock getMaterialInformationBlock() {
        return materialInformationBlock;
    }

    @Override
    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }

    @Override
    public StudentTableBlock getStudentTableBlock() {
        return studentTableBlock;
    }
}
