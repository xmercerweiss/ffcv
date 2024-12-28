package net.xmercerweiss.ffcv.utils;

import java.util.*;

/**
 * A utility class responsible for handling text input and
 * output. Used primarily to handle command line arguments
 * and prompt the user.
 *
 * @author Xavier Mercerweiss
 * @version 0.1
 */
public final class TextIOUtils {

    private static final String EXT_SEP = ".";
    private static final String OPT_SEP = "-";

    // Private constructor used to prevent instantiation
    private TextIOUtils() {}

    /**
     * Converts an array of command line arguments into a set of
     * single-letter option flags.
     * @param args an array of command line arguments
     * @return a set of single-letter option flags
     */
    public static Set<Character> getOptions(String[] args) {
        return new HashSet<>();
    }

    /**
     * Extracts a list of all valid, absolute file paths from an
     * array of command line arguments.
     * @param args an array of command line arguments
     * @return a list of valid absolute file paths
     */
    public static List<String> getFilePaths(String[] args) {
        return new ArrayList<>();
    }

    /**
     * Converts an array of command line arguments into a map
     * representing file conversion rules.
     *
     * The returned map maintains a set of regexes as keys, each
     * of which is matched against a file's extension. IE, the pattern
     * "mp.*" would match all files with "mp3" and "mp4" extensions.
     *
     * The paired value of each key is the file format to which each
     * matching file is to be converted.
     * @param args an array of command line arguments
     * @return a map representing a file conversion ruleset
     */
    public static Map<String,String> getConversionRuleset(String[] args) {
        return new HashMap<>();
    }

    /**
     * Returns true if the given file's extension matches the given regex.
     * @param path a file path
     * @param regex a regex, matched against the given file's extension
     * @return a boolean value
     */
    public static boolean fileMatchesRegex(String path, String regex) {
        return false;
    }

    /**
     * Prompts the user for a yes/no response using the given message.
     *
     * A default (expected) value must be given as a boolean.
     * @param msg a message used to prompt the user
     * @param expected the default response
     * @return a boolean value, true indicating a "yes" response
     */
    public static boolean promptYesNo(String msg, boolean expected) {
        return false;
    }

    /**
     * Prompts the user for a numbered response given a set of options.
     *
     * A default (expected) value must be given as an int.
     * @param msgs a list of options for the user to pick from
     * @param expected the default value
     * @return an integer value
     */
    public static int promptNumber(List<String> msgs, int expected) {
        return 0;
    }
}
