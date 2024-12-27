package utils;

import java.util.*;

import app.Configuration;


public class TextIO {

    private static final String EXT_SEP = ".";
    private static final String OPT_SEP = "-";

    public static Configuration toConfig(String[] args) {
        System.out.println(getOptions(args));
        return new Configuration(Arrays.asList(args), new HashMap<>(), false);
    }

    public static String getExtensionOfFile(String path) {
        String[] split = path.strip().split(EXT_SEP);
        return split[split.length - 1];
    }

    private static List<String> getOptions(String[] args) {
        var options = new HashSet<String>();
        for (String a : args)
            if (a.startsWith(OPT_SEP)) {
                for (int i = 1; i < a.length(); i++) 
                    options.add(a.substring(i, i+1));
                //args.remove(a);
            }   
        return new ArrayList<>(options);
    }
    
}

