package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        //TODO - implement this method!
        Pattern p = Pattern.compile(".*cat.*");
        Matcher m = p.matcher(s);
        Boolean b = m.matches();

        return b;
    }

    public boolean discoverPyramidInSand(String s) {

        //TODO - implement this method!
        Pattern p = Pattern.compile("sand pyramid sand");
        Matcher m = p.matcher(s);
        Boolean b = m.matches();

        return b;
    }

    public boolean readAlphanumericGlyph(String s) {

        //TODO - implement this method!
        Pattern p = Pattern.compile("[1-9]{2,4}[a-z]{3,5}");
        Matcher m = p.matcher(s);
        Boolean b = m.matches();

        return b;
    }

    public boolean captureGoldScarab(String s) {

        //TODO - implement this method!
        Pattern p = Pattern.compile(".*gold scarab");
        Matcher m = p.matcher(s);
        Boolean b = m.matches();

        return b;
    }

    public boolean avoidNileCrocodile(String s) {

        //TODO - implement this method!
        Pattern p = Pattern.compile("(nile )*(nile)( nile)*");
        Matcher m = p.matcher(s);
        Boolean b = m.matches();

        return b;
    }


    public String replaceWithFalseIdol(String s) {

       String result = s.replaceAll("skull", "idol");

        return result;
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
