/**
 * Дана квадратная матрица A[N,N]. Записать на место отрицательных элементов матрицы нули, а на место положительных - единицы.
 */


public class Page74task40 {
    public static void main(String[] args){

        int[][] mass = new int[5][5];

        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                mass[i][j] = (int)(Math.random()*11-5);  //[-5,5]
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] < 0 || mass[i][j] == 0){
                    mass[i][j] = 0;
                } else {
                    mass[i][j] = 1;
                }
            }
        }

        System.out.println("замена <0 на 0, >0 на 1");

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

    }

}
