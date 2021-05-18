package by.epam.unit02.main;

public class Task03 {
    public static void main(String[] args) {
        int T = 654735;
        int h, m, s;
        h = T / 3600;
        m = (T - 3600 * h) / 60;
        s = T - h * 3600 - m * 60;
        System.out.println(h + "ч " + m + "мин " + s + "c");
    }
}
