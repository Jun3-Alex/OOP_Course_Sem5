package OOP_Course.Lesson5.OOPSeminar5.src.Data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    @Override
    public String toString() {
        return "УчебнаяГруппа{\n" +
                "teacher=" + teacher + "\n" +
                ", students=" + students +
                '}';
    }
}

