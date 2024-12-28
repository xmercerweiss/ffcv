package net.xmercerweiss.ffcv.utils;

import java.util.*;

public class TextIO {

    private static final String EXT_SEP = ".";
    private static final String OPT_SEP = "-";

    public static Set<Character> getOptions(String[] args) {
        return new HashSet<>();
    }

    public static List<String> getFilePaths(String[] args) {
        return new ArrayList<>();
    }

    public static Map<String,String> getConversionRuleset(String[] args) {
        return new HashMap<>();
    }

    public static boolean fileMatchesRegex(String path, String regex) {
        return false;
    }

    public static boolean promptYesNo(String msg, boolean expected) {
        return false;
    }

    public static int promptNumber(List<String> msgs, int expected) {
        return 0;
    }
}
