import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student("Vasia", 1);
		Student st2 = new Student("Gleb", 2);
		Student st3 = new Student("Alex", 3);
		Student st4 = new Student("Andrew", 4);
		Student st5 = new Student("Gleb", 5);
		Student st6 = new Student("Eugen", 1);
		Student st7 = new Student("Lena", 2);
		Student st8 = new Student("Olga", 3);
		Student st9 = new Student("Alex", 4);
		
		LinkedList<Student> list1 = new LinkedList<Student>();
		list1.add(st1);
		list1.add(st2);
		list1.add(st3);
		list1.add(st4);
		list1.add(st5);
		list1.add(st6);
		list1.add(st7);
		list1.add(st8);
		list1.add(st9);
		
		Student.printStudents(list1, 2);
		
		


	}

}
