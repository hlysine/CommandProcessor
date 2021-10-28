package io.github.henryyslin.commandprocessor;

public class PingCommand extends Command {
    public PingCommand(CommandProcessor processor) {
        super(processor, "ping", "ping");
    }

    @Override
    protected boolean validate(CommandInput input) {
        return true;
    }

    @Override
    protected void execute(CommandInput input) {
        System.out.println("pong");
    }
}
