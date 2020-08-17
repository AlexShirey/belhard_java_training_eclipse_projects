import java.util.Scanner;

// задание на странице 160 

public class Student {
	private int id;
	String surname, name, otchestvo;
	int birthdate;
	String address;
	int phone;
	String fakultet;
	int course, group;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void show() {
		System.out.println("id: " + id + "; фамилия " + surname + ", имя " + name + ", отчество " + otchestvo
				+ ", год рождения " + birthdate + ", адресс " + address + ", телефон " + phone + ", факультет "
				+ fakultet + ", курс " + course + ", группа " + group);
	}

	public void create() {
		System.out.println("Введите фамилию");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			this.surname = sc.nextLine();
		}
		System.out.println("Введите имя");
		sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			this.name = sc.nextLine();
		}
		System.out.println("Введите отчество");
		sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			this.otchestvo = sc.nextLine();
		}
		System.out.println("Введите год рождения (yyyy) ");
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			this.birthdate = sc.nextInt();
		}
		System.out.println("Введите адрес");
		sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			this.address = sc.nextLine();
		}
		System.out.println("Введите номер телефона");
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			this.phone = sc.nextInt();
		}
		System.out.println("Введите  факультет");
		sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			this.fakultet = sc.nextLine();
		}
		System.out.println("Введите курс");
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			this.course = sc.nextInt();
		}
		System.out.println("Введите номер группы");
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			this.group = sc.nextInt();
		}
	}

	public static Student[] createMass() {
		System.out.println("Введите кол-во студентов");
		int n = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		Student[] mass = new Student[n];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = new Student();
			mass[i].create();
		}
		return mass;
	}

	public static void showMass(Student[] mass) {
		for (int i = 0; i < mass.length; i++) {
			mass[i].show();
		}
	}

	public static void showStudentsByFakultet(Student[] mass, String fakultet) {
		for (int i = 0; i < mass.length; i++) {
			if (mass[i].fakultet.equals(fakultet)) {
				mass[i].show();
			}
		}
	}

	public static void showStudentsByEachCourse(Student[] mass) {
		System.out.println("Список студентов 1 курса");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i].course == 1) {
				mass[i].show();
			}
		}
		System.out.println("Список студентов 2 курса");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i].course == 2) {
				mass[i].show();
			}
		}
	}

	public static void showStudentsByYear(Student[] mass, int year) {
		System.out.println("Список студентов старше " + year + " года");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i].birthdate > year) {
				mass[i].show();
			}
		}
	}

}