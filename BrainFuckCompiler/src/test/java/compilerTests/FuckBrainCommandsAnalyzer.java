package compilerTests;

import compiler.FuckBrainCommands;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class FuckBrainCommandsAnalyzer extends Assert{

    private FuckBrainCommands fbCommands = new FuckBrainCommands();

    @After
    public void refresh() {
        fbCommands.refresh();
    }

    @Test
    public void greaterTest() {
        fbCommands.greater();
        assertEquals(1, fbCommands.getCurrentLocation());
        assertEquals(2, fbCommands.getChars().size());
    }
    @Test
    public void greaterMultiTest() {
        for (int i = 0; i < 3; i++) {
            fbCommands.greater();
        }
        assertEquals(3, fbCommands.getCurrentLocation());
        assertEquals(4, fbCommands.getChars().size());
    }
    @Test
    public void lessTest() {
        fbCommands.less();
        assertEquals(0, fbCommands.getCurrentLocation());
        assertEquals(1, fbCommands.getChars().size());
    }
    @Test
    public void greaterAndLessTest() {
        for (int i = 0; i < 3; i++) {
            fbCommands.greater();
        }
        fbCommands.less();
        assertEquals(2, fbCommands.getCurrentLocation());
        assertEquals(4, fbCommands.getChars().size());
    }
    @Test
    public void getCurrentCharTest() {
        for (int i = 0; i < 60; i++) {
            fbCommands.plus();
        }
        assertEquals('<', fbCommands.getCurrentChar());
    }

}
