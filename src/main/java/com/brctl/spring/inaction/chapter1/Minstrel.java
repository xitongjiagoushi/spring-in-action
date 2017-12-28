package com.brctl.spring.inaction.chapter1;

import java.io.PrintStream;

/**
 * @author duanxiaoxing
 * @created 2017/12/28
 */
public class Minstrel {

    private PrintStream stream;


    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }


    public void singBeforeQuest() {
        stream.println("the knight is so brave before quest.  -- minstrel");
    }


    public void singAfterQuest() {
        stream.println("the knight is also so brave after quest.  -- minstrel");
    }

}
