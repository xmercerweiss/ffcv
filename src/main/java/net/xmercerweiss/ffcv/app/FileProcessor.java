package net.xmercerweiss.ffcv.app;

import java.util.*;

/**
 * The file processor is responsible for performing the main loop of the
 * program. Given a {@link net.xmercerweiss.ffcv.app.FileRegistrar} and
 * a set of conversion rules (given as a Map), the processor maps each
 * file to a format for conversion, prompts the user to resolve conflicts,
 * then instructs FileIOUtils to perform each conversion.
 *
 * @author Xavier Mercerweiss
 * @version 0.1
 */
public class FileProcessor {

    /**
     * Creates a new FileProcessor instance using a registrar of files to
     * operate on.
     *
     * @param registrar the registrar of files to be processed
     */
    public FileProcessor(FileRegistrar registrar) {

    }

    /**
     * Maps each registered file to a file format to be converted to, then
     * instructs FileIOUtils perform this conversion. Prompts the user to resolve
     * conflicts.
     *
     * @param ruleset a map of regexes for file extensions to a new format
     */
    public void performConversions(Map<String,String> ruleset) {

    }
}
