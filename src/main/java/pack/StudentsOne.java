package pack;

import pack.Strategy.OneStrategy;

public class StudentsOne extends Students{

    public StudentsOne(){
        this.learningStrategy = new OneStrategy();
    }
}
