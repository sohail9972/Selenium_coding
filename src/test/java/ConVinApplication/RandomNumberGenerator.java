package ConVinApplication;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    public static void main(String[] args) {
                for(int i=0; i<100; i++)
                {
                    int randomNum = ThreadLocalRandom.current().nextInt(20, 30 + i);
                    System.out.println(randomNum);
                }
            }
        }
