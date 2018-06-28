import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {
String password="";
        String ik="abcdefghijklmnopqrstuvwxyz";
        String po="0123456789";
        String pl="!@#$%^&*()+=/";

        Random r = new Random();
        int z=r.nextInt(25)+0;
        char a=ik.charAt(z);
        password+=a;
        int q=r.nextInt(25)+0;
        char b=ik.charAt(q);
        password+=b;
        int w=r.nextInt(25)+0;
        char c=ik.charAt(w);
        password+=c;
        int o=r.nextInt(25)+0;
        char p=ik.charAt(o);
        password+=p;
        int t=r.nextInt(25)+0;
        char y=ik.charAt(t);
        password+=y;
        int f=r.nextInt(9)+0;
        char g=po.charAt(f);
        password+=g;
        int i=r.nextInt(9)+0;
        char l=po.charAt(i);
        password+=l;
        int u=r.nextInt(9)+0;
        char n=po.charAt(u);
        password+=n;
        int m=r.nextInt(9)+0;
        char k=po.charAt(m);
        password+=k;

        int h=r.nextInt(13)+0;
        char x=pl.charAt(h);
        password+=x;





        {

        }


        return password;
    }
}
