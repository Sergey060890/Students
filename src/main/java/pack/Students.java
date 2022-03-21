package pack;

import java.util.Random;

public class Students {
    public static final int BEST_FULL_TIME = 198;
    LearningStrategy learningStrategy;
    public static int numberStudent;

    public void education() {
        learningStrategy.education();
    }

    public static double talent() {
        Random random = new Random();
        Double[] doubles = new Double[]{0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
        return doubles[random.nextInt(doubles.length)];
    }

}
