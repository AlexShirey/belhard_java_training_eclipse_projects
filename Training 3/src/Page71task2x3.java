/*
 * 2. составить линейную программу, печатающую значение true, если указанное значение является истинным,
 * и false - в противном случае;
 * 2.3 Целое число N является четным двухзначным числом;  
 */
public class Page71task2x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 56;
		
		if (N>=10 && N <= 99 && N % 2 == 0){
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
