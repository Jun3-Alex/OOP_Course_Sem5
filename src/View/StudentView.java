package OOP_Course.Lesson5.OOPSeminar5.src.View;

import OOP_Course.Lesson5.OOPSeminar5.src.Data.Student;
import OOP_Course.Lesson5.OOPSeminar5.src.Data.StudentGroup;

public class StudentView {
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }

    public void printOnConsole(StudentGroup group){ System.out.println(group.toString());}

}
