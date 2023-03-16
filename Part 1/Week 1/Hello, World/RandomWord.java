import javax.sound.sampled.SourceDataLine;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String s = "";
        for (int i = 1; !StdIn.isEmpty(); i++) {
            String line = StdIn.readString();
            if (StdRandom.bernoulli(1.0/i)) {
                s = line;
            }
        }
        StdOut.println(s);
    }
}