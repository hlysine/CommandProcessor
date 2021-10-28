package io.github.henryyslin.commandprocessor;

public class SayCommand extends Command {

    public SayCommand(CommandProcessor processor) {
        super(processor, "say", "say <text>");
    }

    @Override
    protected boolean validate(CommandInput input) {
        if (input.parameters().size() == 0) {
            System.out.println("No text provided.");
            return false;
        }
        return true;
    }

    @Override
    protected void execute(CommandInput input) {
        System.out.println(String.join(" ", input.parameters()));
    }
}
