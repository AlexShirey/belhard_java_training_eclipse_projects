package Nasledovanie;

import java.util.Scanner;

/**
 * Created by Shirey on 13.05.2016.
 */
public class Dogs extends Animals{
    private static String className = "Dogs";
    private String strength;

    public Dogs(){

    }

    public Dogs(String name, int age, int weight, String strength){
        super(name, age, weight);
        this.strength = strength;
    }

    public void create(){
        super.create();
        System.out.println("Введите силу");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println("Вы ввели не силу, нужно слово (сильный, слабый..)");
            //sc.nextInt();
            sc = new Scanner(System.in);
        }
        this.strength = sc.nextLine();

    }


    public void show(){
        super.show();
        StringBuffer sb = new StringBuffer();
        sb.append(strength).append(" strength ");
        System.out.print(sb);
    }

    public String getClassName(){
        return className;
    }

    public String getStrength(){
        return strength;
    }

    public void setStrength(String strength){
        this.strength = strength;
    }




}