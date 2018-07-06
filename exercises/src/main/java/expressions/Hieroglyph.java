package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {
        Pattern p = Pattern.compile("(sacred )*cat( sacred)*");
        Matcher m = p.matcher(s);
        boolean b = m.matches ();
        boolean b1 = Pattern.matches("(sacred )*cat( sacred)*", s);
        return b;
    }

    public boolean discoverPyramidInSand(String s) {
        Pattern p = Pattern.compile("(sand) pyramid (sand)");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        boolean b1 = Pattern.matches("(sand) pyramid (sand)", s);
        return b;

        //TODO - implement this method!

    }

    public boolean readAlphanumericGlyph(String s) {
        Pattern p = Pattern.compile("[0-9]{2,4}[a-z]{3,4}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        boolean b1 = Pattern.matches("[0-9]{2,4}[a-z]{3,4}",s);
        return b;

        //TODO - implement this method!


    }

    public boolean captureGoldScarab(String s) {
        Pattern p = Pattern.compile("(scarab )?? gold scarab");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        boolean b1 = Pattern.matches("(scarab )?? gold scarab",s);
        return b;

        //TODO - implement this method!

    }

    public boolean avoidNileCrocodile(String s) {
        Pattern p = Pattern.compile("(nile)* nile (nile)*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        boolean b1 = Pattern.matches("(nile)* nile (nile)*",s);
        return b;


        //TODO - implement this method!

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
