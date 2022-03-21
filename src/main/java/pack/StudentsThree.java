package pack;

import pack.Strategy.ThreeStrategy;
import pack.Strategy.TwoStrategy;

public class StudentsThree extends Students{
    public StudentsThree(){
        this.learningStrategy = new ThreeStrategy();
    }
}
