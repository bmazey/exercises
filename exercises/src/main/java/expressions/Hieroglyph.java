package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

        Pattern p = Pattern.compile("(sacred )*cat( sacred)*");
        Matcher m = p.matcher(s);
        boolean b = m.matches ();

        //TODO - implement this method!

        return b;
    }

    public boolean discoverPyramidInSand(String s) {

       Pattern p = Pattern.compile("(sand )+pyramid( sand)+");
        Matcher m = p.matcher(s);
        boolean b = m.matches ();


        //TODO - implement this method!

        return b;
    }

    public boolean readAlphanumericGlyph(String s) {

        Pattern p = Pattern.compile("[0-9]{2,4}[a-z]{3,4}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();


        //TODO - implement this method!

        return b;
    }

    public boolean captureGoldScarab(String s) {

        Pattern p = Pattern.compile("(scarab )*gold( scarab)+");
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        //TODO - implement this method!

        return b;
    }

    public boolean avoidNileCrocodile(String s) {

        Pattern p = Pattern.compile("(nile )*nile( nile)*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        //TODO - implement this method!

        return b;
    }


    public String replaceWithFalseIdol(String s) {

      String i = s.replaceAll("skull", "idol");


        //TODO - implement this method!

        return i;
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
