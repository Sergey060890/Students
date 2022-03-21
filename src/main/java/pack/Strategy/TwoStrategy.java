package pack.Strategy;

import pack.LearningStrategy;
import pack.Students;

import java.util.ArrayList;
import java.util.List;

public class TwoStrategy implements LearningStrategy {
    public static final int COMPLEXITY = 2;
    public static final int NUMBER_OF_LEVELS = 2;
    public String type = "TwoType";
    public double timeSkill = Students.BEST_FULL_TIME;

    @Override
    public void education() {
        Students.numberStudent++;
        timeSkill *= COMPLEXITY;
        double talent = Students.talent();
        double total = timeSkill / talent;
        double fullTime = Math.round(total);
        double part = Math.round(total) / NUMBER_OF_LEVELS;
        System.out.println("Student type: " + type);
        System.out.println("Student number: " + Students.numberStudent);
        System.out.println("Student talent: " + talent);
        System.out.println("Time for parsing: " + part + " hours");
        System.out.println("Time for practice: " + part + " hours");
        System.out.println("Total time to master a skill: " + fullTime + " hours");
        System.out.println("-------------------------------------------");
    }
}
