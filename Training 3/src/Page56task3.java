/*
 * В переменные a и b записаны целые числа, при этом b больше a. Создайте программу, которая будет генерировать и выводить
 * на экран целое псевдослучайное число из отрезка [a; b] 
 * 
 */
public class Page56task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 7;

		System.out.println((int) (Math.random() * (b - a + 1) + a));

	}

}
