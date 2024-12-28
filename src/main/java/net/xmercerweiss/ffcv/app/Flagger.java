package net.xmercerweiss.ffcv.app;

/**
 * The flagger is a singleton object responsible for
 * storing the boolean state of various options passed
 * via the command line. Each flag is represented by the
 * {@link net.xmercerweiss.ffcv.app.Flag} enum.
 *
 * @author Xavier Mercerweiss
 * @version 0.1
 */
public class Flagger {

    /**
     * If no Flagger instance exists, creates one.
     * Otherwise, does nothing.
     */
    public static void instantiate() {

    }

    /**
     * Returns the state of the given flag.
     *
     * @param flag a flag enum
     * @return the boolean state of the given flag
     */
    public static boolean getFlag(Flag flag) {
        return false;
    }

    /**
     * Sets the given flag to the given boolean.
     * @param flag a flag enum
     * @param value a boolean value
     */
    public static void setFlag(Flag flag, boolean value) {

    }
}
