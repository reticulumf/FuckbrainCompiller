package compiler;

import compiler.commands.*;

public class FuckBrainCodeParser {
    private FuckBrainCommands fbCommands = new FuckBrainCommands();
    Worker worker = new Worker(new GreaterCommand(fbCommands),
            new LessCommand(fbCommands),
            new PlusCommand(fbCommands),
            new MinusCommand(fbCommands),
            new DotCommand(fbCommands));
    private String code = "";

    public boolean isValidateCodeWithoutCycles() {
        return code.matches("[-+<>.]+");
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void executeCode() {
        if (isValidateCodeWithoutCycles()) {
            char[] charArray = code.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                switch (charArray[i]) {
                    case '.':
                        worker.doDot();
                        break;
                    case '>':
                        worker.doGreater();
                        break;
                    case '<':
                        worker.doLess();
                        break;
                    case '+':
                        worker.doPlus();
                        break;
                    case '-':
                        worker.doMinus();
                        break;
                }
            }
        }
        else
            System.out.println("syntax error");
    }
}
