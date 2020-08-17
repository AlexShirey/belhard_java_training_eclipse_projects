package Nasledovanie;

import java.util.Scanner;

/**
 * Created by Shirey on 13.05.2016.
 */
public class Kitties extends Cats{
    private static String className = "Kitties";
    private String color;

    public Kitties(){

    }

    public Kitties(String name, int age, int weight,  String voice, String color){
        super(name, age, weight, voice);
        this.color = color;
    }

    public void create(){
        super.create();
        System.out.println("Введите цвет");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println("Вы ввели не цвет");
            //sc.nextInt();
            sc = new Scanner(System.in);
        }
        this.color = sc.nextLine();
    }

    public void show(){
        super.show();
        StringBuffer sb = new StringBuffer();
        sb.append(color).append(" color ");
        System.out.print(sb);
    }

    public String getClassName(){
        return className;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




}