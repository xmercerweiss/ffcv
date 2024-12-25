package app;

import java.util.Arrays;

import utils.TextIO;


public class Launcher {
    
    public static void main(String[] args) {
        var config = TextIO.toConfig(args);
        System.out.println(config.getInputs());
    }
}

