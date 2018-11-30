package compiler.commands;

import compiler.FuckBrainCommands;

public class LessCommand implements Command{
    private FuckBrainCommands fuckBrainCommands;

    public LessCommand(FuckBrainCommands fuckBrainCommands) {
        this.fuckBrainCommands = fuckBrainCommands;
    }

    public void execute() {
        fuckBrainCommands.less();
    }
}
