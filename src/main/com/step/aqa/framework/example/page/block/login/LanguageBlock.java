package com.step.aqa.framework.example.page.block.login;

import com.step.aqa.framework.example.annatation.Block;
import com.step.aqa.framework.example.page.block.BaseBlock;
import com.step.aqa.framework.example.page.block_interface.login.language_element.HasLanguageElement;
import com.step.aqa.framework.example.page.block_interface.login.language_element.HasTitleLanguageElement;
import com.step.aqa.framework.example.page.element.login.language_element.LanguageElement;
import com.step.aqa.framework.example.page.element.login.language_element.TitleLanguageElement;

@Block(blockName = "Language login block")
public class LanguageBlock extends BaseBlock implements HasLanguageElement, HasTitleLanguageElement {

    private LanguageElement languageElement = new LanguageElement("selector for language");
    private TitleLanguageElement titleLanguageElement = new TitleLanguageElement("selector for title language");

    @Override
    public LanguageElement getLanguageElement() {
        return languageElement;
    }

    @Override
    public TitleLanguageElement getTitleLanguageElement() {
        return titleLanguageElement;
    }
}
