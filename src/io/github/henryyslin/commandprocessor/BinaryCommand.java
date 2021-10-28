package io.github.henryyslin.commandprocessor;

public abstract class BinaryCommand extends Command {
    protected BinaryCommand(CommandProcessor processor, String name, String usage) {
        super(processor, name, usage);
    }

    @Override
    protected boolean validate(CommandInput input) {
        if (input.parameters().size() == 0) {
            System.out.println("No values provided.");
            return false;
        } else if (input.parameters().size() == 1) {
            System.out.println("Two values required.");
            return false;
        }
        return true;
    }
}
