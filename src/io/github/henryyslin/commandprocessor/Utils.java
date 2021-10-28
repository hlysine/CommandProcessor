package io.github.henryyslin.commandprocessor;

import java.util.Optional;

public class Utils {

    public static Optional<Double> tryParseDouble(String string) {
        try {
            double val = Double.parseDouble(string);
            return Optional.of(val);
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }
    }
}
