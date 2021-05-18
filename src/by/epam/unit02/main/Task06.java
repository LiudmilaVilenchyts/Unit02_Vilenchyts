package by.epam.unit02.main;

public class Task06 {
    public static void main (String[] args)
    {
        double z;
        double M = 777.77;
        double N = 30.33;
        double y = M / N;
        z = (y-(int)y)*10;
        System.out.println("M/N= " + y);
        System.out.println("Старшая цифра дробной части =" + (int)z);
        System.out.println("Младшая цифра целой части =" + (int)y%10);
    }
}
