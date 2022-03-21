package pack.Strategy;

import pack.LearningStrategy;
import pack.Students;

public class OneStrategy implements LearningStrategy {
    public static final int NUMBER_OF_LEVELS = 3;
    public String type = "OneType";
    public double timeSkill = Students.BEST_FULL_TIME;

    @Override
    public void education() {
        Students.numberStudent++;
        double talent = Students.talent();
        double total = timeSkill / talent;
        double fullTime = Math.round(total);
        double part = Math.round(total) / NUMBER_OF_LEVELS;
        System.out.println("Student type: " + type);
        System.out.println("Student number: " + Students.numberStudent);
        System.out.println("Student talent: " + talent);
        System.out.println("Time for parsing: " + part + " hours");
        System.out.println("Time for practice: " + part + " hours");
        System.out.println("Being in the flow: " + part + " hours");
        System.out.println("Total time to master a skill: " + fullTime + " hours");
        System.out.println("-------------------------------------------");
    }
}
