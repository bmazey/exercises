package algorithms;

import java.util.ArrayList;
import java.util.List;

public class RabinKarp {
    // d is the number of characters in the input alphabet
    public final static int d = 256;

    /* pat -> pattern
        txt -> text
        q -> A prime number
    */
    public static ArrayList<Integer> search(String pat, String txt, int q) {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // list of matches to be returned
        ArrayList<Integer> matches = new ArrayList<Integer>();

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M-1; i++)
            h = (h*d)%q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++)
        {
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++)
        {

            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters on by one

            //TODO - implement this method! :)
        }

        return matches;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String txt = "test test test";
        String pat = "test";
        int q = 101; // A prime number
        search(pat, txt, q);
    }
}