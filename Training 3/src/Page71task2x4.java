/*
 * 2. составить линейную программу, печатающую значение true, если указанное значение является истинным,
 * и false - в противном случае;
 * 2.4 Данная тройка натуральных чисел a, b, c является тройкой Пифагора, т.е. c2 = a2 + b2;  
 */
public class Page71task2x4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 4;
		int c = 5;

		if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
