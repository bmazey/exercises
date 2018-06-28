import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {
String password="";
        String ik="abcdefghijklmnopqrstuvwxyz";//string containing all letters
        String po="0123456789";// string containing all digits
        String pl="!@#$%^&*()+=/";// string containing some symbols

        Random r = new Random();// adding a new object of Random class
        int z=r.nextInt(25)+0;//choosing random integer
        char a=ik.charAt(z);//taking one letter from ik
        password+=a;//adding new letter to password
        int q=r.nextInt(25)+0;//choosing random integer
        char b=ik.charAt(q);//taking one letter from ik
        password+=b;//adding new letter to password
        int w=r.nextInt(25)+0;//choosing random integer
        char c=ik.charAt(w);//taking one letter from ik
        password+=c;//adding new letter to password
        int o=r.nextInt(25)+0;//choosing random integer
        char p=ik.charAt(o);//taking one letter from ik
        password+=p;//adding new letter to password
        int t=r.nextInt(25)+0;//choosing random integer
        char y=ik.charAt(t);//taking one letter from ik
        password+=y;//adding new letter to password
        int f=r.nextInt(9)+0;//choosing random integer
        char g=po.charAt(f);//taking one digit from po
        password+=g;//adding new digit to password
        int i=r.nextInt(9)+0;//choosing random integer
        char l=po.charAt(i);//taking one digit from po
        password+=l;//adding new digit to password
        int u=r.nextInt(9)+0;//choosing random integer
        char n=po.charAt(u);//taking one digit from po
        password+=n;//adding new digit to password
        int m=r.nextInt(9)+0;//choosing random integer
        char k=po.charAt(m);//taking one digit from po
        password+=k;//adding new digit to password

        int h=r.nextInt(13)+0;//choosing random integer
        char x=pl.charAt(h);//taking one symbol from pl
        password+=x;//adding new symbol to password





        {

        }


        return password;
    }
}
