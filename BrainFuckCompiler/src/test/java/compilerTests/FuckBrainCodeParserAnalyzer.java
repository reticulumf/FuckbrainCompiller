package compilerTests;

import compiler.FuckBrainCodeParser;
import org.junit.Assert;
import org.junit.Test;

public class FuckBrainCodeParserAnalyzer extends Assert {
    FuckBrainCodeParser fbCodeParser = new FuckBrainCodeParser();
    @Test
    public void isValidateCodeTestPlus()
    {
        fbCodeParser.setCode("+");
        assertEquals(true, fbCodeParser.isValidateCodeWithoutCycles());
    }
    @Test
    public void isValidateCodeTestMinus()
    {
        fbCodeParser.setCode("-");
        assertEquals(true, fbCodeParser.isValidateCodeWithoutCycles());
    }
    @Test
    public void isValidateCodeTestGreater()
    {
        fbCodeParser.setCode(">");
        assertEquals(true, fbCodeParser.isValidateCodeWithoutCycles());
    }
    @Test
    public void isValidateCodeTestLess()
    {
        fbCodeParser.setCode("<");
        assertEquals(true, fbCodeParser.isValidateCodeWithoutCycles());
    }
    @Test
    public void isValidateCodeTestDot()
    {
        fbCodeParser.setCode(".");
        assertEquals(true, fbCodeParser.isValidateCodeWithoutCycles());
    }
    @Test
    public void isValidateCodeTestValidateString()
    {
        fbCodeParser.setCode(".+++>>><--->++<+.++");
        assertEquals(true, fbCodeParser.isValidateCodeWithoutCycles());
    }
    @Test
    public void isValidateCodeTestInvalidateString()
    {
        fbCodeParser.setCode(".+++>>><--0->++<+.++");
        assertEquals(false, fbCodeParser.isValidateCodeWithoutCycles());
    }
}
