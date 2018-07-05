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

        //TODO - implement this method!

        return true;
    }

    public boolean avoidNileCrocodile(String s) {

        //TODO - implement this method!

        return true;
    }


    public String replaceWithFalseIdol(String s) {

        //TODO - implement this method!

        return new String();
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
