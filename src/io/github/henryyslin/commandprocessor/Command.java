package io.github.henryyslin.commandprocessor;

public abstract class Command {

    private final String name;
    private final String usage;
    private final CommandProcessor processor;

    protected Command(CommandProcessor processor, String name, String usage) {
        this.processor = processor;
        this.name = name;
        this.usage = usage;
    }

    public String getName() {
        return name;
    }

    public String getUsage() {
        return usage;
    }

    public CommandProcessor getProcessor() {
        return processor;
    }

    public boolean isMatch(CommandInput input) {
        return input.command().equals(name);
    }

    protected abstract boolean validate(CommandInput input);

    protected abstract void execute(CommandInput input);

    public void handleCommand(CommandInput input) {
        if (validate(input))
            execute(input);
        else
            System.out.println("Usage: " + getUsage());
    }
}
