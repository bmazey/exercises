package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        Pattern i = Pattern.compile(".*cat.*");
        Matcher t = i.matcher(s);

        return t.matches();
    }

    public boolean discoverPyramidInSand(String s) {

        Pattern i = Pattern.compile("sand* pyramid sand*");
        Matcher t = i.matcher(s);
        return t.matches();
    }

    public boolean readAlphanumericGlyph(String s) {

        Pattern i = Pattern.compile("[0-9]{2,4}[a-z]{2,4}");
        Matcher t = i.matcher(s);
        return t.matches();
    }

    public boolean captureGoldScarab(String s) {

        Pattern i = Pattern.compile(".*gold scarab.*");
        Matcher t = i.matcher(s);
        return t.matches();
    }

    public boolean avoidNileCrocodile(String s) {

        Pattern i = Pattern.compile(".*crocodile.*");
        Matcher t = i.matcher(s);
        return !t.matches();
    }


    public String replaceWithFalseIdol(String s) {

        Pattern i = Pattern.compile("");

        return new String();
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
