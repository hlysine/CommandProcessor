package io.github.henryyslin.commandprocessor;

public class SubtractCommand extends ArithmeticCommand {
    public SubtractCommand(CommandProcessor processor) {
        super(processor, "subtract");
    }

    @Override
    protected void execute(CommandInput input) {
        double val1 = Double.parseDouble(input.parameters().get(0));
        double val2 = Double.parseDouble(input.parameters().get(1));
        System.out.println(val1 - val2);
    }
}
