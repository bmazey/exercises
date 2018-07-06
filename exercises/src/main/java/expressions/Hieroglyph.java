package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {
        Pattern p = Pattern.compile("(.*)cat(.*)");  // It works!
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }

    public boolean discoverPyramidInSand(String s) {
        Pattern p = Pattern.compile("sand pyramid sand"); // Works!
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }

    public boolean readAlphanumericGlyph(String s) {
        Pattern p = Pattern.compile("[1-9]{2-4}[a-z][3-4]");   // Not working ;(
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }

    public boolean captureGoldScarab(String s) {
        Pattern p = Pattern.compile("(.*)gold scarab(.*)");  // Perfectly working!
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }

    public boolean avoidNileCrocodile(String s) {
        Pattern p = Pattern.compile("(.*)nile crocodile(.*)");  // Works!!
        Matcher m = p.matcher(s);
        boolean b = !m.matches();
        return b;
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
