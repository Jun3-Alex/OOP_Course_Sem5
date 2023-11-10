package OOP_Course.Lesson5.OOPSeminar5.src;

import OOP_Course.Lesson5.OOPSeminar5.src.Controler.Controler;
import OOP_Course.Lesson5.OOPSeminar5.src.Data.Student;
import OOP_Course.Lesson5.OOPSeminar5.src.Data.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1","1","1");
        controler.createStudent("2", "2","2","2");
        controler.createStudent("3", "3","3","3");
        controler.createStudent("4", "4","4","4");

//        controler.getAllStudent();
        controler.createGroup(new Teacher("5","5","5","5",1),controler.getListOfStudents());



    }
}