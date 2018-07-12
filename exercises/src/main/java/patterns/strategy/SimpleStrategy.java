package patterns.strategy;

public class SimpleStrategy implements StrategyInterface {

    public String workString(String s1, String s2) {
        if (s1.equals("Marina")){
            String s3 = s2.replaceAll(s2, "Let's go!");
        }
        else {String s3 =  s2.replaceAll(s2, "Nah, you cannot go"); }
        return s2;
    }
}
