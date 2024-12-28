package net.xmercerweiss.ffcv.app;

import java.util.*;

/**
 * The file registrar maintains a list of file paths for processing,
 * and provides an interface for referencing the paths which match a
 * given regex. The regex is matched against the extension of each file.
 *
 * @author Xavier Mercerweiss
 * @version 0.1
 */
public class FileRegistrar {

    /**
     * Creates a new FileRegistrar instance given a list of file paths.
     *
     * @param paths the file paths referenced by the registrar
     */
    public FileRegistrar(List<String> paths) {

    }

    /**
     * Given a regex, returns all referenced files whose extension matches
     * the regex. IE, given the pattern "mp.*", this method will return a
     * list of files ending in "mp3" or "mp4".
     *
     * @param regex the pattern matched against the extension of each
     *              registered file
     * @return a list of all files with an extension matching the pattern
     */
    public List<String> getMatchingFiles(String regex) {
        return new ArrayList<>();
    }
}
