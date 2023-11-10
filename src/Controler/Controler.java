package OOP_Course.Lesson5.OOPSeminar5.src.Controler;

import OOP_Course.Lesson5.OOPSeminar5.src.Data.*;
import OOP_Course.Lesson5.OOPSeminar5.src.Service.DataService;
import OOP_Course.Lesson5.OOPSeminar5.src.Service.StudentGroupService;
import OOP_Course.Lesson5.OOPSeminar5.src.View.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService groupService = new StudentGroupService();


    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }
    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public List<Student> getListOfStudents(){
        List<User> userList = service.getAllStudent();
        List<Student> students = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student){
                students.add((Student) user);
            }
        }
        return students;

    }
    public void createGroup(Teacher teacher, List<Student> students){
        groupService.createGroup(teacher, students);
        studentView.printOnConsole(groupService.getGroup());
    }
}
