package com.brctl.spring.inaction.chapter1;

/**
 * Brave Knight
 * @author duanxiaoxing
 * @created 2017/12/28
 */
public class BraveKnight implements Knight {

    private Quest quest;


    public BraveKnight(Quest quest) {
        this.quest = quest;
    }


    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

}
