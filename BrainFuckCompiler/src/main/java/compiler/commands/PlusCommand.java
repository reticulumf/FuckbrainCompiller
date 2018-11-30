package compiler.commands;

import compiler.FuckBrainCommands;

public class PlusCommand implements Command {
    private FuckBrainCommands fuckBrainCommands;

    public PlusCommand(FuckBrainCommands fuckBrainCommands) {
        this.fuckBrainCommands = fuckBrainCommands;
    }

    public void execute() {
        fuckBrainCommands.plus();
    }
}
