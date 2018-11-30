package compiler.commands;

import compiler.FuckBrainCommands;

public class MinusCommand implements Command {
    private FuckBrainCommands fuckBrainCommands;

    public MinusCommand(FuckBrainCommands fuckBrainCommands) {
        this.fuckBrainCommands = fuckBrainCommands;
    }

    public void execute() {
        fuckBrainCommands.minus();
    }
}
