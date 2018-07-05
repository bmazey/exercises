package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        Pattern p = Pattern.compile("(.*)cat(.*)");
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

        Pattern p = Pattern.compile("[0-9]{2,4}[a-z]{3,4}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        return b;
    }

    public boolean captureGoldScarab(String s) {

        Pattern p = Pattern.compile("(.*)gold scarab");
        Matcher m = p.matcher(s);

        return m.matches() ;
    }

    public boolean avoidNileCrocodile(String s) {

        Pattern p = Pattern.compile("(?!.*crocodile).*nile.*(?!.*crocodile)");
        // "(?!.*crocodile).*nile.*(?!.*crocodile)"
        // "nile( nile)*"
        Matcher m = p.matcher(s);

        return m.matches();
    }


    public String replaceWithFalseIdol(String s) {

        String replaceString = s.replaceAll("skull", "idol" );

        return replaceString;
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
