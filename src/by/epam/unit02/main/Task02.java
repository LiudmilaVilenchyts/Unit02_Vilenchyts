package by.epam.unit02.main;


public class Task02 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int temp;
        if (x < y) {
            temp = y;
            y = x;
            x = temp;
            System.out.println("x=" + x + '\n'+ "y=" + y);
        } else {
            System.out.println("Значения переменных соответствуют условию");
        }
    }
}
