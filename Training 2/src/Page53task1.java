import java.util.Scanner;

/*
 * Написать программу, которая по номеру месяца будет определять пору года.
 * Номер месяца вводить с клавиатуры.
 * Предусмотреть проверку на некорректный ввод
 */

public class Page53task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while (true){
			System.out.println("enter month number");
			if (!sc.hasNextInt()){
				System.out.println("its not number");
				sc.nextLine();
			}
			else{
				int n = sc.nextInt();
				switch (n){
				case 12: case 1: case 2:
					System.out.println("Winter");
					break;
				case 3: case 4: case 5:
					System.out.println("Spring");
					break;
				case 6: case 7: case 8:
					System.out.println("Summer");
					break;
				case 9: case 10: case 11:
					System.out.println("Autumn");
					break;
				default:
					System.out.println("its not month's number");
				}
					
				break;
			}
			
		}
		
		

	}

}
