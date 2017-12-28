package com.brctl.spring.inaction.chapter1;

import java.io.PrintStream;

/**
 * Slay Dragon Quest
 * @author duanxiaoxing
 * @created 2017/12/28
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;


    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }


    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon.");
    }

}
