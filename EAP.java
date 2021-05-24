
import java.util.ArrayList;
import java.util.List;

public class Scoala {

    private String nume;
    private Map<String, Materie> materii = new HashMap<>();

    public Scoala(String nume) {
        this.nume = nume;
    }

    public String getName() {
        return nume;
    }

    public void adauga_materie(Materie Materie) {
        materie.add(materie.nume, materie);
    }

    public Materie getMaterie(String nume) {
        return materie.get(nume);
    }
}


public class Student {
    private String nume;
    private String prenume;
    private String email;
    private int grupa;

    // construct a new student with given fields
    public Student(String nume, String prenume, String email, int grupa) {
        this.nume   = nume;
        this.prenume    = prenume;
        this.email   = email;
        this.grupa = grupa;
    }


    public boolean less(Student b) {
        Student a = this;
        return a.grupa < b.grupa;
    }


    public String toString() {
        return grupa + " " + nume + " " + prenume + " " + email;
    }
}

public class Profesor {
    private String nume;
    private String Materie;
    private int Data; // De cand profeseaza
    private int concediu; // Zile de concediu ramase

    public Profesor(int id, String nume, String Materie, int data, int holidaysRemaining) {
        this.id = id;
        this.nume = nume;
        this.materie = materie;
        this.data = data;
        this.concediu = concediu;
}

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

public class Grad_Student extends Student {

   private String source;
   private double rate;


   public Grad_Student (String nume, int materii,
             String support_source, double hourly_rate) {

      super (nume, materii);

      source = support_source;
      rate = hourly_rate;

   }

   public void support () {

      System.out.println ("Support source: " + source);
      System.out.println ("Hourly pay rate: " + rate);

   }

}

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

   
