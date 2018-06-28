import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        String chars = "abcdefghijklmnopqrstuvwxyz";
        String ints = "1234567890";
        String symbies = "`~!@#$%^&*()_-+={[}]:;<>?/";
        //Letters/numbers/symbols will be drawn from these strings and assembled into the password.

        Random rand = new Random();

        String password = "";
        //The string "password" starts off as blank

        int z = rand.nextInt(25) + 0;
            char a = chars.charAt(z);
                password += a;
        int y = rand.nextInt(25) + 0;
            char b = chars.charAt(y);
                password += b;
        int x = rand.nextInt(25) + 0;
            char c = chars.charAt(x);
                password += c;
        int w = rand.nextInt(25) + 0;
            char d = chars.charAt(w);
                password += d;
        int v = rand.nextInt(25) + 0;
            char e = chars.charAt(v);
                password += e;
                //The first five randomly generated integers (between 25 and 0) are converted into letters using charAt,
                //and assembled one-by-one onto the password string.

        int u = rand.nextInt(9) + 0;
            char f = ints.charAt(u);
                password += f;
        int t = rand.nextInt(9) + 0;
            char g = ints.charAt(t);
                password += g;
        int s = rand.nextInt(9) + 0;
            char h = ints.charAt(s);
                password += h;
        int r = rand.nextInt(9) + 0;
            char i = ints.charAt(r);
                password += i;
                //Four more integers are generated randomly and added onto the end of the "password" string.

        int q = rand.nextInt(25) + 0;
            char j = symbies.charAt(q);
                password += j;
                //Finally, a symbol is generated from the above string, since the last character can't be a letter or integer.

        return password;
    }           //The password is returned

}