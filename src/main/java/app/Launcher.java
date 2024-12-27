package app;

import java.util.Arrays;

import utils.TextIO;


public class Launcher {

    private static final String VERSION = "v0.1";
    
    public static void main(String[] args) {
        var config = TextIO.toConfig(args);
        System.out.println(config.getInputs());
    }

    public static String getVersion() {
        return VERSION;
    }
}

