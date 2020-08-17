/*
 * 2. составить линейную программу, печатающую значение true, если указанное значение является истинным,
 * и false - в противном случае;
 * 2.1 Сумма двух первых цифр заданного четырехзначного числа равна сумму двух его последних цифр: 
 */
public class Page71task2x1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1643;

		int n1 = n / 1000;
		int n234 = n % 1000;
		int n2 = n234 / 100;
		int n34 = n234 % 100;
		int n3 = n34 / 10;
		int n4 = n34 % 10;

		if (n1 + n2 == n3 + n4) {
			System.out.println(true);
		} else {
			System.out.println(false);

		}

	}

}
