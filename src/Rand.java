import java.util.Random;

public class Rand {

    public int Rand () {
        int min = -200;
        int max = 200;
        int diff = max - min;
        Random random = new Random();
        int rX1 = random.nextInt(diff + 1);
        rX1 += min;
        return rX1;
    }

    public static int randPlus (int bound) {
        Random r = new Random();
        int newRand = r.nextInt(bound) + 3;
        return newRand;
    }
}
