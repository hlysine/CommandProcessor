package io.github.henryyslin.commandprocessor;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final record CommandInput(String command, @NotNull List<String> parameters) {

    public static CommandInput fromString(String input) {
        List<String> parts = Arrays.stream(input.split(" ")).toList();
        return new CommandInput(parts.get(0), parts.stream().skip(1).collect(Collectors.toList()));
    }
}
