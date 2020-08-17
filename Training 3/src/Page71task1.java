/*
 * Написать программу, которая выводит на экран первые четыре степени числа n;
 */
public class Page71task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for (int i = 0; i < 4; i++){
			System.out.println((int)Math.pow(n, i+1));
			
		}
		

	}

}
