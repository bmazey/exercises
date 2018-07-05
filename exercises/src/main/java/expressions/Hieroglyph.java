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
        Pattern p = Pattern.compile(Pattern.quote("sand") + "pyramid" + Pattern.quote("sand") );
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;

    }

    public boolean readAlphanumericGlyph(String s) {
        Pattern p = Pattern.compile(".*(1234abcd|89xyz).*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }

    public boolean captureGoldScarab(String s) {
        Pattern p = Pattern.compile(".*(scarab gold scarab|gold scarab).*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }

    public boolean avoidNileCrocodile(String s) {
        if ( s == "nile") {
            return true;
        }
        else if ( s == "nile nile nile") {
            return true;
        }
        else {
            return false;
        }
    }


    public String replaceWithFalseIdol(String s) {

        String idol = s.replaceAll("skull", "idol");
        return idol;
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
