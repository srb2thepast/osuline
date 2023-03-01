import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.Console;
import java.lang.*;

class wordTest {
    public static void main(String[] args) {
        wordTest wt = new wordTest();
        wt.shortestDistance(new String[] {"a","b","c"}, "a", "c");
        wt.atTheEnd();
    }

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int res = 0;
        int closest = 10000000;

        // loop through all words
        for (int i = 0; i < wordsDict.length; i++) {
            // get next occurance of word1
            if (wordsDict[i].equals(word1)) {
                System.out.println(word1 + " | "+i);
                // loop forwards starting at word1
                int curSTART = i;
                // loop forwards from word1
                for (int z = curSTART; z < wordsDict.length; z++) {
                    String curWord = wordsDict[z];
                    if (curWord.equals(word2)) {
                        if (Math.abs(curSTART - z) < closest) {
                            closest = Math.abs(curSTART - z);
                            System.out.println(closest);
                        }
                    }
                }
                // loop backwards from word1
                for (int z = curSTART; z >= 0; z--) {
                    String curWord = wordsDict[z];
                    if (curWord.equals(word2)) {
                        if (Math.abs(curSTART - z) < closest) {
                            closest = Math.abs(curSTART - z);
                            System.out.println(closest);
                        }
                    }
                }
            }
        }

        System.out.println(closest);
        return Math.abs(closest);
    }


    @Test
    void atTheEnd() {
        String[] test = {"blarg", "darg", "harg", "l;ads", "fefw", "sdfsfd", "this", "another"};
        assertTrue(shortestDistance(test, "this", "another")==1);
        
    }

    @Test
    void atTheBeginning() {
        String[] test = {"this", "that", "harg", "l;ads", "fefw", "sdfsfd","this" , "sdf", "that", "another"};
        assertTrue(shortestDistance(test, "that", "this")==1);
        
    }
    
    @Test
    void lotsOfRepeats() {
        String[] test = {"hoew", "that", "sdff", "this", "this", "this", "this" , "sdf", "that", "another"};
        assertTrue(shortestDistance(test, "that", "this")==2);
        
    }
    
    @Test
    void lotsOfRepeats2() {
        String[] test = {"hoew", "that", "sdff", "this", "this", "sdfsd", "this", "this" , "sdf", "this","that", "another"};
        assertTrue(shortestDistance(test, "that", "this")==1);
        
    }
    @Test
    void reallyFarAppart() {
        String[] test = {"hoew", "that", "sdff", "this", "this", "sdfsd", "this", "this" , "sdf", "this","that", "another"};
        assertTrue(shortestDistance(test, "hoew", "another")==11);
        
    }
    
}