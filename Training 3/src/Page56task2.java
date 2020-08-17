/*
 * Натуральное положительное число записано в переменную n. Создайте программу, которая будет генерировать
 * и выводить на экран целое псевдослучайное число из отрезка [-n; n]
 */
public class Page56task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2;
		int max = n;
		int min = -n;
		
		System.out.println((int)(Math.random()*(max-min+1)+min));

	}

}
