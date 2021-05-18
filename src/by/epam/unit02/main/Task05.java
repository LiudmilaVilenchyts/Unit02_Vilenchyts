package by.epam.unit02.main;

public class Task05 {
    public static void main (String[] args){
        double x = 3;
        double y = 5;
        double res;
        res= (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("Значение выражения = " + res);
    }
}
