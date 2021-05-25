package Main;

import Clase.*;
import BD.*;
import BD.StudentBD;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class SysFunctions {
    public void AddStudent() throws SQLException {
        Student stud = new Student();
        StudentBD studDao = new StudentBD();
        studBD.add(stud);
    }

    public void SelectStudent() throws SQLException {
        StudentBD studBD = new StudentBD();
        Scanner in = new Scanner(System.in);
        System.out.println("ID-ul studentului:");
        int x = in.nextInt();
        Student e = studBD.getStudent(x);
        System.out.println(e.getIDstudent() + " "
                + e.getNume() + " " + e.getPrenume() + " "
                + e.getGrupa());
    }

    public void SelectAllStudents() throws SQLException {
        StudentBD studbd = new StudentBD();
        List<Student> ls = studbd.getStudents();
        for (Student allstud : ls) {
            System.out.println(allstud.getIDstudent() + " " + allstud.getNume() + " " + allstud.getPrenume() + " "
                    + allstud.getGrupa());
        }
    }

    public void UpdateStudent() throws SQLException {
        StudentBD studBD = new StudentBD();
        Scanner in = new Scanner(System.in);
        System.out.println("ID-ul studentului:");
        int x = in.nextInt();
        Student student = studBD.getStudent(x);
        System.out.println("Prenumele cu care doriti sa schimbati:");
        student.setPrenume(in.nextLine());
        studDao.update(student);
    }

    public void DeleteStudent() throws SQLException {
        StudentDAO studDao = new StudentDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("ID-ul studentului:");
        int x = in.nextInt();
        studDao.delete(x);
    }
   
  public void AddProfesor() throws SQLException {
        Profesor stud = new Profesor();
        ProfesorBD studBD = new ProfesorBD();
        studDao.add(stud);
    }

    public void SelectProfesor() throws SQLException {
        ProfesorBD studBD = new ProfesorBD();
        Scanner in = new Scanner(System.in);
        System.out.println("ID-ul Profesorului:");
        int x = in.nextInt();
        Profesor e = studBD.getProfesor(x);
        System.out.println(e.getIDprofesor() + " "
                + e.getNume() + " " + e.getPrenume());
    }

    public void SelectAllProfesors() throws SQLException {
        ProfesorBD studBD = new ProfesorBD();
        List<Profesor> ls = studBD.getProfesors();
        for (Profesor allprof : ls) {
            System.out.println(allprof.getIDprofesor() + " " + allprof.getNume() + " " + allprof.getPrenume());
        }
    }

    public void UpdateProfesor() throws SQLException {
        ProfesorBD studBD = new ProfesorBD();
        Scanner in = new Scanner(System.in);
        System.out.println("ID-ul Profesorului:");
        int x = in.nextInt();
        Profesor Profesor = studBD.getProfesor(x);
        System.out.println("Prenumele cu care doriti sa schimbati:");
        Profesor.setPrenume(in.nextLine());
        studBD.update(Profesor);
    }

    public void DeleteProfesor() throws SQLException {
        ProfesorBD studBD = new ProfesorBD();
        Scanner in = new Scanner(System.in);
        System.out.println("ID-ul Profesorului:");
        int x = in.nextInt();
        studBD.delete(x);
    }

