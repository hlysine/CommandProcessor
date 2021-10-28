package io.github.henryyslin.commandprocessor;

public class QuitCommand extends Command {
    public QuitCommand(CommandProcessor processor) {
        super(processor, "quit", "quit");
    }

    @Override
    protected boolean validate(CommandInput input) {
        return true;
    }

    @Override
    protected void execute(CommandInput input) {
        getProcessor().stop();
    }
}
