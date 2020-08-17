
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ivanov = new Student();
		
		ivanov.NumberCourse = 5;
		ivanov.NameStudent = "Иван";
		
		System.out.println(ivanov.NumberCourse + " " + ivanov.NameStudent);
		
		//Student petrov = new Student();
		
		//petrov.NumberCourse = 5;
		//petrov.NameStudent = "Петя";
		
		//System.out.println(petrov.NumberCourse + " " + petrov.NameStudent);
		
		Student petrov = ivanov;
	//	System.out.println(ivanov.NumberCourse + " " + ivanov.NameStudent);
	//	System.out.println(petrov.NumberCourse + " " + petrov.NameStudent);
		
		ivanov.NumberCourse = 6;
		ivanov.NameStudent = "Иван2";
	//	System.out.println(ivanov.NumberCourse + " " + ivanov.NameStudent);
	//	System.out.println(petrov.NumberCourse + " " + petrov.NameStudent);
		
		ivanov.show();
		petrov.show();
		
		System.out.println(petrov.sredBall());
		
		int[] mass = new int[5];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int)(Math.random()*7+1);
		}
		
		System.out.println(ivanov.sredBall(mass));		

	}

}
