package com.brctl.spring.inaction.chapter1;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Brave Knight Test-class
 * @author duanxiaoxing
 * @created 2017/12/28
 */
public class BraveKnightTest {

    @Test
    public void testEmbarkOnQuest() {
        // mock Quest instance
        Quest mockQuest = Mockito.mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        // verify execute times
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }

}
