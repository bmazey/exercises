package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        //TODO - implement this method!
        Pattern cat = Pattern.compile(".*cat.*");
        Matcher cMatch = cat.matcher(s);
        boolean bCat = cMatch.matches();

        return bCat;
    }

    public boolean discoverPyramidInSand(String s) {

        //TODO - implement this method!
        Pattern pyramid = Pattern.compile("sand pyramid sand");
        Matcher pMatch = pyramid.matcher(s);
        boolean bPyramid = pMatch.matches();

        return bPyramid;
    }

    public boolean readAlphanumericGlyph(String s) {
        Pattern alpha = Pattern.compile("[1-9]{2,4}[a-z]{3,4}");
        Matcher aMatch = alpha.matcher(s);
        boolean bAlpha = aMatch.matches();

        return bAlpha;
        //TODO - implement this method!

    }

    public boolean captureGoldScarab(String s) {
        Pattern scarab = Pattern.compile(".*gold scarab.*");
        Matcher sMatch = scarab.matcher(s);
        boolean bScarab = sMatch.matches();

        return bScarab;

        //TODO - implement this method!

    }

    public boolean avoidNileCrocodile(String s) {
        Pattern crocodile = Pattern.compile("(?!crocodile)(nile )*");
        Matcher crMatch = crocodile.matcher(s);
        boolean bCrocodile = crMatch.matches();

        return bCrocodile;
        //TODO - implement this method!

    }


    public String replaceWithFalseIdol(String s) {
        Pattern idol = Pattern.compile(".*crystal idol.*");
        Matcher iMatch = idol.matcher(s);
        return s.replaceAll("skull", "idol");

        //TODO - implement this method!

    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
