/*
 * Задана квадратная матрица. Поменять местами строку с максимальным элементом на главной
 * диагонали со строкой с заданным номером;
 */
public class Page74task36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mass = new int[5][5];
		
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 11); //[10;0]
			}
		}
		
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		
		int max = 0;
		int n = 0;
		int N = 2; // на строку с таким номером надо поменять
		
		for (int i = 0; i < mass.length; i++){
			if (mass[i][i] > max){
				max = mass[i][i];
				n = i;
			}
			
		}
		
		int[] temp = new int[mass[0].length];
		temp = mass[N];
		mass[N] = mass[n];
		mass[n] = temp;
		
		System.out.println("sorted");
		
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
