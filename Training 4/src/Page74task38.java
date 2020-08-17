

/**
 * Дана целая квадратная матрица n-ого порядка. Определить, является ли она магическим квадратом, т.е. суммы элементов во всех
 * строках и столбцах одинаковы.
 */
public class Page74task38 {
    public static void main(String[] args){

       int[][] mass = {{7, 12, 1, 14}, {2, 13, 8, 11}, {16, 3, 10, 5}, {9, 6, 15, 4}};

       for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int x = 0;
        int x1 = 0;
        for (int i = 0; i < mass.length-1; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                x = x + mass[i][j];
                x1 = x1 + mass[i+1][j];
            }
            if (x == x1 && i == mass.length-2){
               continue;
            } else if (x == x1){

                x = 0;
                x1 = 0;
                continue;
            } else {
                break;
            }

        }

        int y = 0, y1 = 0;
        for (int i = 0; i < mass.length-1; i++){
            for (int j = 0; j < mass.length; j++){
                y = y + mass[j][i];
                y1 = y1 + mass[j][i+1];
            }
            if (y == y1 && i == mass.length-2){
               continue;
            } else if (y == y1){
                y = 0;
                y1 = 0;
                continue;
            } else {
                break;
            }
        }

        if (x1 == y1 && x == x1 && y == y1){
            System.out.print("это магический квадрат");
        } else
        {
            System.out.print("это не магический квадрат");
        }

    }
}
