package pack.Strategy;

import pack.LearningStrategy;
import pack.Students;

public class ThreeStrategy implements LearningStrategy {
    public static final int COMPLEXITY = 3;
    private String type = "ThreeType";
    public double timeSkill = Students.BEST_FULL_TIME;

    @Override
    public void education() {
        Students.numberStudent++;
        timeSkill *= COMPLEXITY;
        double talent = Students.talent();
        double total = timeSkill / talent;
        double part = Math.round(total);
        System.out.println("Student type: " + type);
        System.out.println("Student number: " + Students.numberStudent);
        System.out.println("Student talent: " + talent);
        System.out.println("Total time to master a skill (practice): " + part + " hours");
        System.out.println("-------------------------------------------");
    }
}
