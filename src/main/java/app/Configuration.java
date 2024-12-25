package app;

import java.util.regex.Pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Configuration {
    
    private final ArrayList<String> inputs = new ArrayList<>();
    private final HashMap<String,String> ruleset = new HashMap<>();

    private final boolean isLogging;

    public Configuration(
            List<String> paths, 
            HashMap<String,String> ruleset,
            boolean isLogging
    ) {
        inputs.addAll(paths);
        this.ruleset.putAll(ruleset);
        this.isLogging = isLogging;
    }

    public List<String> getInputs() {
        return new ArrayList<>(inputs);
    }

    public List<String> getMatchingInputs(String pattern) {
        var output = new ArrayList<String>();
        for (String path : inputs)
            if (Pattern.matches(pattern, path))
                output.add(path);
        return output;
    }

    public List<String> getInputPatterns() {
        return new ArrayList<>(ruleset.keySet());
    }

    public boolean isLogging() {
        return isLogging;
    }
}

