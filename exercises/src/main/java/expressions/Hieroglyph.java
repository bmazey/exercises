package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        boolean a = Pattern.matches(".*cat.*", s);
        return a;
    }

    public boolean discoverPyramidInSand(String s) {

      boolean b = Pattern.matches("sand pyramid sand", s);
      return b;

    }

    public boolean readAlphanumericGlyph(String s) {

        boolean c = Pattern.matches("[1-9]{2,4}[a-z]{3,4}", s);
        return c;
    }

    public boolean captureGoldScarab(String s) {

        boolean d = Pattern.matches(".*gold.*", s);
        return d;
    }

    public boolean avoidNileCrocodile(String s) {

        boolean e = Pattern.matches("(nile )*nile( nile)*", s);
        return e;
    }


    public String replaceWithFalseIdol(String s) {



        return new String();
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
