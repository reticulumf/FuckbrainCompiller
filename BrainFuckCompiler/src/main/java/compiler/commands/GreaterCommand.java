package compiler.commands;

import compiler.FuckBrainCommands;

public class GreaterCommand implements Command {

    private FuckBrainCommands fuckBrainCommands;

    public GreaterCommand(FuckBrainCommands fuckBrainCommands) {
        this.fuckBrainCommands = fuckBrainCommands;
    }

    public void execute() {
        fuckBrainCommands.greater();
    }
}
