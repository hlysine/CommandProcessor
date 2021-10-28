package io.github.henryyslin.commandprocessor;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CommandProcessor {
    private final List<Command> commands = List.of(
            new PingCommand(this),
            new SayCommand(this),
            new AddCommand(this),
            new SubtractCommand(this),
            new QuitCommand(this)
    );

    private boolean exitSignal;

    public void stop() {
        exitSignal = true;
    }

    public void run() {
        exitSignal = false;

        System.out.println("Command Processor");
        System.out.println("Type 'quit' to exit");

        Scanner console = new Scanner(System.in);
        while (!exitSignal) {
            System.out.println();
            System.out.print("> ");
            CommandInput input = CommandInput.fromString(console.nextLine());
            Optional<Command> command = commands.stream().filter(cmd -> cmd.isMatch(input)).findFirst();
            command.ifPresentOrElse(
                    cmd -> cmd.handleCommand(input),
                    () -> System.out.println("Command not recognized.")
            );
        }
    }
}
