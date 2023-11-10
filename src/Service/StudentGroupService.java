package OOP_Course.Lesson5.OOPSeminar5.src.Service;

import OOP_Course.Lesson5.OOPSeminar5.src.Data.Student;
import OOP_Course.Lesson5.OOPSeminar5.src.Data.StudentGroup;
import OOP_Course.Lesson5.OOPSeminar5.src.Data.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup group;

    public void createGroup(Teacher teacher, List<Student> students) {
        this.group = new StudentGroup(teacher, students);
    }

    public OOP_Course.Lesson5.OOPSeminar5.src.Data.StudentGroup getGroup() {
        return group;
    }

    public void setGroup(OOP_Course.Lesson5.OOPSeminar5.src.Data.StudentGroup group) {
        this.group = group;
    }
}

