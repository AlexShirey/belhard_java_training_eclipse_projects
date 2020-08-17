
/*
 * 2. составить линейную программу, печатающую значение true, если указанное значение является истинным,
 * и false - в противном случае;
 * 2.2 Сумма цифр данного трехзначного числа N является четным числом;  
 */

public class Page71task2x2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 123;

		int n1 = N / 100;
		int n23 = N % 100;
		int n2 = n23 / 10;
		int n3 = n23 % 10;

		if ((n1 + n2 + n3) % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
