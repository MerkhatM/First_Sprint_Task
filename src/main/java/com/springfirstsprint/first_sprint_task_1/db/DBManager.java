package com.springfirstsprint.first_sprint_task_1.db;

import com.springfirstsprint.first_sprint_task_1.models.Student;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Student> students = new ArrayList<>();
    public static Long id = 7L;

    static {
        students.add(new Student(1L, "Ilyas", "Zhuanyshev", 88, "B"));
        students.add(new Student(2L, "Serik", "Erikov", 91, "A"));
        students.add(new Student(3L, "Erik", "Serikov", 65, "C"));
        students.add(new Student(4L, "Nurzhan", "Bolatov", 48, "F"));
        students.add(new Student(5L, "Sabina", "Assetova", 33, "F"));
        students.add(new Student(6L, "Karina", "Serzhanova", 51, "D"));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        if (student != null) {
            if (student.getExam() >= 90) {
                student.setMark("A");
            } else if (student.getExam() >= 75) {
                student.setMark("B");
            } else if (student.getExam() >= 60) {
                student.setMark("C");
            } else if (student.getExam() >= 50) {
                student.setMark("D");
            } else student.setMark("F");

            student.setId(id);
            id++;
            students.add(student);
        }
    }
}
