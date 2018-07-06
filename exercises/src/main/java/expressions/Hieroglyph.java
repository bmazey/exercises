package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        Pattern p = Pattern.compile(".*cat.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }

    public boolean discoverPyramidInSand(String s) {

        Pattern p = Pattern.compile("sand pyramid sand");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;

    }

    public boolean readAlphanumericGlyph(String s) {

        Pattern p = Pattern.compile("1234abcd|89xyz");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;


    }

    public boolean captureGoldScarab(String s) {

        Pattern p = Pattern.compile(".*gold scarab");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;



    }

    public boolean avoidNileCrocodile(String s) {
        Pattern p = Pattern.compile("(nile )*nile( nile)*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }


    public String replaceWithFalseIdol(String s) {
       String x= s.replaceAll("skull", "idol");
return x;
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */

    }
}
