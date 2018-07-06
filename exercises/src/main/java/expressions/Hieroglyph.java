package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        Pattern SacredCats = Pattern.compile(".*cat.*");
        Matcher IsSacredCats = SacredCats.matcher(s);
        boolean matchSacredCats = IsSacredCats.matches();

        return matchSacredCats;

    }

    public boolean discoverPyramidInSand(String s) {

        Pattern PyramidInSand = Pattern.compile("sand pyramid.*");
        Matcher IsPyramidInSand = PyramidInSand.matcher(s);
        boolean matchPyramidInSand = IsPyramidInSand.matches();

        return matchPyramidInSand;
    }

    public boolean readAlphanumericGlyph(String s) {

        Pattern AlphanumericGlyph = Pattern.compile("[0-9]{2,4}[a-z]{3,4}");
        Matcher IsAlphanumericGlyph = AlphanumericGlyph.matcher(s);
        boolean matchAlphanumericGlyph = IsAlphanumericGlyph.matches();

        return matchAlphanumericGlyph;

    }

    public boolean captureGoldScarab(String s) {

        Pattern GoldScarab = Pattern.compile(".*gold scarab.*");
        Matcher IsGoldScarab = GoldScarab.matcher(s);
        boolean matchGoldScarab = IsGoldScarab.matches();

        return matchGoldScarab;
    }

    public boolean avoidNileCrocodile(String s) {

        Pattern NoNileCrocodile = Pattern.compile("nile( nile)*");
        Matcher IsNoNileCrocodile = NoNileCrocodile.matcher(s);
        boolean matchNoNileCrocodile = IsNoNileCrocodile.matches();

        return matchNoNileCrocodile;
    }


    public String replaceWithFalseIdol(String s) {

        String ReplacedS = s.replace("skull", "idol");

        return ReplacedS;
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}

// 07.07.18 Coding Fin ><(((('>
