package compiler.commands;

import compiler.FuckBrainCommands;

public class DotCommand implements Command {
    private FuckBrainCommands fuckBrainCommands;

    public DotCommand(FuckBrainCommands fuckBrainCommands) {
        this.fuckBrainCommands = fuckBrainCommands;
    }

    public void execute() {
        fuckBrainCommands.dot();
    }
}
