package by.epam.unit02.main;

public class Task08 {
    public static void main(String[] args) {
        int x = 0;
        int y = -1;
        if (x > -4 & x < 4 & y > -3 & y < 0) { //проверяем принадлежность к области ниже оси Х
            System.out.println("true");
        } else if (x > -2 & x < 2 & y > -3 & y < 5) { //проверяем принадлежность к области выше оси Х
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
