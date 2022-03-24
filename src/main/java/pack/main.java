package pack;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();//создаём обьекты студентов
        students.add(new StudentsOne());
        students.add(new StudentsOne());
        students.add(new StudentsOne());
        students.add(new StudentsTwo());
        students.add(new StudentsTwo());
        students.add(new StudentsTwo());
        students.add(new StudentsThree());
        students.add(new StudentsThree());
        students.add(new StudentsThree());

        for (Students st : students//вызываем у каждого студента метод education
        ) {
            st.education();
        }
    }
}
