package io.github.henryyslin.commandprocessor;

public abstract class ArithmeticCommand extends BinaryCommand {

    protected ArithmeticCommand(CommandProcessor processor, String name) {
        super(processor, name, name + " <decimal1> <decimal2>");
    }

    @Override
    protected boolean validate(CommandInput input) {
        if (!super.validate(input)) return false;
        if (Utils.tryParseDouble(input.parameters().get(0)).isEmpty()
                || Utils.tryParseDouble(input.parameters().get(1)).isEmpty()) {
            System.out.println("Invalid value.");
            return false;
        }
        return true;
    }
}
