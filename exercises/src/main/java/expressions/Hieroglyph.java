package expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {

       Pattern c = Pattern.compile(".*cat.*");
       Matcher cats = c.matcher(s);
       return cats.matches();
    }

    public boolean discoverPyramidInSand(String s) {

        Pattern p = Pattern.compile("sand pyramid sand");
        Matcher pyramids = p.matcher(s);
        boolean morepyramids = pyramids.matches();
        return morepyramids;
    }

    public boolean readAlphanumericGlyph(String s) {

        Pattern p = Pattern.compile("\\d{2,4}\\w{3,4}");
        Matcher password = p.matcher(s);
        boolean morepasswords = password.matches();
        return morepasswords;
    }

    public boolean captureGoldScarab(String s) {

        Pattern g = Pattern.compile(".*gold scarab");
        Matcher gold = g.matcher(s);
        boolean moregold = gold.matches();
        return moregold;
    }

    public boolean avoidNileCrocodile(String s) {

        Pattern n = Pattern.compile("(?!.*crocodile).*nile.*");
            //Pattern n = Pattern.compile("nile ( nile)*");
        Matcher nile = n.matcher(s);
        boolean morenile = nile.matches();
        return morenile;
    }


    public String replaceWithFalseIdol(String s) {

        String f = s.replaceAll("skull", "idol");
        return f;
    }
}
