package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {
        return s.matches(".*cat.*");
    }

    public boolean discoverPyramidInSand(String s) {
        return s.matches("(sand)+ pyramid (sand)+");
    }

    public boolean readAlphanumericGlyph(String s) {
        return s.matches("[0-9]{2,4}[a-z]{1,4}");
    }

    public boolean captureGoldScarab(String s) {
        return s.matches(".*gold scarab");
    }

    public boolean avoidNileCrocodile(String s) {
        return s.matches("(nile )*nile");
    }


    public String replaceWithFalseIdol(String s) {
        return s.replaceAll("skull", "idol");
    }


    public static void main(String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}

