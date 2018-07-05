package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        Pattern cat = Pattern.compile(".*cat.*");
        Matcher c = cat.matcher(s);
        boolean bCat = c.matches();


        //TODO - implement this method!

        return bCat;
    }

    public boolean discoverPyramidInSand(String s) {


        Pattern sand = Pattern.compile("sand.pyramid.sand");
        Matcher a = sand.matcher(s);
        boolean aSand = a.matches();

        //TODO - implement this method!

        return aSand;
    }

    public boolean readAlphanumericGlyph(String s) {

        Pattern AlphanumericGlyph = Pattern.compile("[1-9]{2,4}[a-z]{3,4}");
        Matcher n = AlphanumericGlyph.matcher(s);
        boolean nAlphanumericGlyph = n.matches();

        //TODO - implement this method!

        return nAlphanumericGlyph;
    }

    public boolean captureGoldScarab(String s) {

        Pattern GoldScarab = Pattern.compile(".*gold.scarab");
        Matcher x = GoldScarab.matcher(s);
        boolean xGoldScarab = x.matches();

        //TODO - implement this method!

        return xGoldScarab;
    }

    public boolean avoidNileCrocodile(String s) {

        Pattern Nile = Pattern.compile("nile.*.*");
        Matcher m = Nile.matcher(s);
        boolean mNile = m.matches();

        //TODO - implement this method!

        return mNile;
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
