
public class Student {

	public int NumberCourse;
	public String NameStudent;

	public void show() {
		System.out.print("Курс " + NumberCourse + "; Имя студента " + NameStudent);
		System.out.println();
	}
	
	public int sredBall(){
		int[] mass = new int[5];
		for (int i = 0; i < mass.length; i++){
			mass[i] = (int)(Math.random()*10+1); //[1;10]
		}
		int x = 0;
		for (int i : mass){
			x = x + i;
		}
		int sredBall = x / mass.length;
		return sredBall;
		
	}

	
	public int sredBall(int[] array) {
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			x = x + array[i];
		}
		return x / array.length;
	}

}
