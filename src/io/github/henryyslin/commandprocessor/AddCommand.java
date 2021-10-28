package io.github.henryyslin.commandprocessor;

public class AddCommand extends ArithmeticCommand {
    public AddCommand(CommandProcessor processor) {
        super(processor, "add");
    }

    @Override
    protected void execute(CommandInput input) {
        double val1 = Double.parseDouble(input.parameters().get(0));
        double val2 = Double.parseDouble(input.parameters().get(1));
        System.out.println(val1 + val2);
    }
}
