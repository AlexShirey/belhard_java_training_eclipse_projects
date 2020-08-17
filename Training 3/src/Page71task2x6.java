/*
 * 2. составить линейную программу, печатающую значение true, если указанное значение является истинным,
 * и false - в противном случае;
 * 2.6 Данное четырехзначное число читается одинаково слева направо и справа налево;  
 */
public class Page71task2x6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7887;

		int a1 = a / 1000;
		int a234 = a % 1000;
		int a2 = a234 / 100;
		int a34 = a234 % 100;
		int a3 = a34 / 10;
		int a4 = a34 % 10;
		
		if (a1 == a4 && a2 == a3){
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
