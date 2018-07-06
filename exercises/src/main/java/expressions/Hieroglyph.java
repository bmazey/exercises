package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {
    Pattern cat = Pattern.compile(".*cat.*");
    Matcher catMatch = cat.matcher(s);
    boolean bCat = catMatch.matches();

    return bCat;


    }

    public boolean discoverPyramidInSand(String s) {

        Pattern sand = Pattern.compile("sand pyramid sand");
        Matcher sandMatch = sand.matcher(s);
        boolean bSand = sandMatch.matches();


        return bSand;

    }

    public boolean readAlphanumericGlyph(String s) {

        Pattern glyph = Pattern.compile("[0-9]{2,4}[a-z]{3,4}");
       Matcher glyphMatch = glyph.matcher(s);
       boolean bGlyph = glyphMatch.matches();
       return bGlyph;

    }

    public boolean captureGoldScarab(String s) {

        Pattern goldScarab = Pattern.compile(".*gold scarab.*");
        Matcher goldMatch = goldScarab.matcher(s);
        boolean bGoldScarab = goldMatch.matches();

        return bGoldScarab;
    }

    public boolean avoidNileCrocodile(String s) {

        Pattern crocodile = Pattern.compile("(nile )*nile( nile)*");
        Matcher crocodileMatch = crocodile.matcher(s);
        boolean bCrocodile = crocodileMatch.matches();


        return bCrocodile;
    }


    public String replaceWithFalseIdol(String s) {
Pattern idol = Pattern.compile(".*crystal idol.*");
Matcher iMatch = idol.matcher(s);
return s.replaceAll("skull","idol");



    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
