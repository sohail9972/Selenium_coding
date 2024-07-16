package ConVinApplication;

import java.util.Random;

public class RandomNumberGenration {
    public static void main(String[] args) {
        //There are mulitple ways to generate the Random numbers in java
        //Using Rnadom () method
        //using Random class
        //Using ThreadLocalRandom Class
        //Using the ints() Method (in java 8 only)
//Math.random()

        int num ;
        Random random = new Random();
        num  = random.nextInt(10);
        System.out.println("generated Number "+  (num));
    }
}
