
// Задание на странице 160
// класс Student.java

public class Page160Task1 {

	public static void main(String[] args) {

		// Student student1 = new Student();
		// student1.setId(1);
		// System.out.println(student1.getId());

		// student1.create();
		// student1.show();
		
		

		Student[] mass = Student.createMass();  //метод создает массив объектов - студентов;

		for (int i = 0; i < mass.length; i++) { // задаем id объектов в массиве (id - private);
			mass[i].setId(i + 1);
		}

		Student.showMass(mass); // метод выводит на экран список студентов;
		Student.showStudentsByFakultet(mass, "ftk"); //метод выводит на экран список студентов заданного факультета;
		Student.showStudentsByEachCourse(mass); //метод выводи на экран списки студентов по курсам;
		Student.showStudentsByYear(mass, 2000); //метод выводит на экран список студентов старше заданного года рождения;

	}

}
