package by.epam.unit02.main;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args){
        double F;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение Х (<= -3 или > 3):");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
            if (x<=-3){
                F=9;
                System.out.println("F(x) =" + F);
            }
            else if (x>3){
                F=1/(Math.pow(x,2)+1);
                System.out.println("F(x) =" + F);
            }
            else {
                System.out.println("Значение Х за пределами допустимого диапазона");
            }
        }
    }
}
