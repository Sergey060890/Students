package pack;

import pack.Strategy.TwoStrategy;

public class StudentsTwo extends Students{
    public StudentsTwo(){
        this.learningStrategy = new TwoStrategy();
    }
}
