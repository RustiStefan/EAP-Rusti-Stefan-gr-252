package Clase;

import java.util.ArrayList;

public class Materie {

    Map<String, Student> students = new HashMap<>();
    String nume;
    int Lungime;
    Teacher teacher;

    public Materie(int id, String name, int length, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student.name, student);
    }

    public void getStudent(String name) {
        students.get(name);
    }
}
