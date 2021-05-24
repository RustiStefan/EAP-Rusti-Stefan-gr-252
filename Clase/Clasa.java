package Clase;

import java.util.Scanner;

public class Clasa {

	private List<Students> studentsList = new ArrayList<>();

	public void enter(Students students) {
		studentsList.add(students);
		System.out.println("Enter " + students.getName());
	}

	public void leave(Students students) {
		studentsList.remove(students);
		System.out.println("Leave " + students.getName());
	}

	public void printStidentsInfo(int i, Students students) {
		System.out.println(studentsList.get(i).getName());
	}

	public void getStudentsCount() {
		int count = 0;
		while (count < studentsList.size()) {
			count += 1;
		}
		System.out.println("In clasa sunt " + count + " elevi");
	}

	public void getStudents() {
		for (int i = 0; i < studentsList.size(); i++) {
			System.out.println(studentsList.get(i).getName() + " " + studentsList.get(i).getSecondName());
		}
	}

	public void isPresent(Students students){
		for (int i = 0; i < studentsList.size(); i++) {
			if(students.getName().equals(studentsList.get(i).getName())){
				if(students.getSecondName().equals(studentsList.get(i).getSecondName())){
					System.out.println("Elevul "+students.getName()+" "+ students.getSecondName()+" e prezent");
				}
			}
		}
		System.out.println("Elevul "+students.getName()+" "+ students.getSecondName()+" e absent");
	}
}
