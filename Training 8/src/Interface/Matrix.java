package Interface;


import java.util.Scanner;
//implements Arithmetic
public class Matrix implements Arithmetic {
    private int[][] mass;
    private int[][] summMass;

    public int[][] getSummMass(){
        return summMass;
    }

    public int[][] getMass(){
        return mass;
    }

    public void setMass(int[][] mass){
        this.mass = mass;

    }

    public void createMatrix(){
        System.out.println("Введите число - кол-во строк в матрице");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()){
            System.out.println("Вы ввели не число, введите число - кол-во строк в матрице");
            sc = new Scanner(System.in);
        }
        int n = sc.nextInt();
        System.out.println("Введите число - кол-во столбцов в матрице");
        while (!sc.hasNextInt()){
            System.out.println("Вы ввели не число, введите число - кол-во столбцов в матрице");
            sc = new Scanner(System.in);
        }
        int m = sc.nextInt();
        this.mass = new int[n][m];
    }

    public void fillMatrix(){
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++)
                mass[i][j] = (int)(Math.random()*21);
        }
    }

    public void show(){
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        Matrix other = (Matrix) obj;
        if (this.mass.length == other.mass.length){
            for (int i = 0; i < this.mass.length; i++){
                if (this.mass[i].length == other.mass[i].length){
                    for (int j = 0; j < this.mass[i].length; j++){
                        if (this.mass[i][j] != other.mass[i][j]){
                            return false;
                        }
                    }
                } else return false;
            }
        } else return false;
        return true;
    }

    public void summ(Object obj){
        Matrix other = (Matrix) obj;
        summMass = new int[Math.max(this.mass.length, other.mass.length)][];
        if (this.mass.length > other.mass.length) {
            for (int i = 0; i < this.mass.length; i++) {
                summMass[i] = new int[this.mass[i].length];
            }
            for (int i = 0; i < other.mass.length; i++) {
                if (other.mass[i].length > summMass[i].length) {
                    summMass[i] = new int[other.mass[i].length];
                }
            }
        } else {
            for (int i = 0; i < other.mass.length; i++) {
                summMass[i] = new int[other.mass[i].length];
            }
            for (int i = 0; i < this.mass.length; i++) {
                if (this.mass[i].length > summMass[i].length) {
                    summMass[i] = new int[this.mass[i].length];
                }
            }
        }

        for (int i = 0; i < this.mass.length; i++){
            for (int j = 0; j < this.mass[i].length; j++){
                summMass[i][j] += this.mass[i][j];
            }
        }
        for (int i = 0; i < other.mass.length; i++){
            for (int j = 0; j < other.mass[i].length; j++){
                summMass[i][j] += other.mass[i][j];
            }
        }
        System.out.println("Сумма двух матриц:");
        for (int i = 0; i < summMass.length; i++){
            for (int j = 0; j < summMass[i].length; j++){
                System.out.print(summMass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showOne() {
        System.out.println("Введите число - номер строки в матрице");
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                if (i > mass.length || i <= 0) {
                    System.out.println("номер строки за пределами матрицы");
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("это не число, введите число");
                sc = new Scanner(System.in);
            }
        }
        System.out.println("Введите число - номер столбца в матрице");
        int j;
        while (true) {
            if (sc.hasNextInt()) {
                j = sc.nextInt();
                if (j > mass[i-1].length || j <= 0) {
                    System.out.println("номер столбца за пределами матрицы");
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("это не число, введите число");
                sc = new Scanner(System.in);
            }
        }
        System.out.println("искомое число: " + mass[i-1][j-1]);
    }

    public void delenie(int n){
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                mass[i][j] = mass[i][j]/n;
            }
        }

    }


}