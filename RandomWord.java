/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String result = "";
        double p = 0;
        while (!StdIn.isEmpty()) {
            String words = StdIn.readString().trim();
            if (words.equals("stop")) {
                break;
            }
            for (String word : words.split(" ")) {
                p++;
                if (StdRandom.bernoulli(1.0 / p)) {
                    result = word;
                }
            }
        }
        StdOut.println(result);
    }
}
