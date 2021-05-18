package by.epam.unit02.main;

public class Task04 {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double res;
        x1 = 2;
        x2 = 5;
        y1 = 4;
        y2 = 7;
        res = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("Расстояние между точками равно " + res);
    }
}
