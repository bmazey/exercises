package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {



        Pattern p = Pattern.compile("(sacred )*cat( sacred)*" );
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        return b;
    }

    public boolean discoverPyramidInSand(String s) {

        Pattern p = Pattern.compile("(sand )* pyramid ( sand)*" );
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        return b;
    }

    public boolean readAlphanumericGlyph(String s) {

        //TODO - implement this method!

        Pattern p = Pattern.compile("(sacred )*cat( sacred)*" );
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        return b;
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
