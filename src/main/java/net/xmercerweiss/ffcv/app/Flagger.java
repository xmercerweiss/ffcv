package net.xmercerweiss.ffcv.app;

import java.util.*;

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

    private static Flagger instance = null;

    private final HashMap<Flag,Boolean> values = new HashMap<>();

    private Flagger() {
        for (Flag f : Flag.values())
            values.put(f, false);
    }

    /**
     * If no Flagger instance exists, creates one.
     * Otherwise, returns the existing instance.
     * @return a Flagger instance
     */
    public static Flagger instantiate() {
        if (instance == null) {
            instance = new Flagger();
        }
        return instance;
    }

    /**
     * Returns the state of the given flag.
     *
     * @param flag a flag enum
     * @return the boolean state of the given flag
     */
    public boolean getFlag(Flag flag) {
        return values.get(flag);
    }

    /**
     * Sets the given flag to the given boolean.
     * @param flag a flag enum
     * @param value a boolean value
     */
    public void setFlag(Flag flag, boolean value) {
        values.put(flag, value);
    }
}
