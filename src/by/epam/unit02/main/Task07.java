package by.epam.unit02.main;

public class Task07 {
    public static void main(String[] args) {
        double x, y, z;
        x = 0;
        y = 5;
        z = -10;
        if (x >= 0) {
            x = Math.pow(x, 2);
        } else {
            x = Math.pow(x, 4);
        }
        if (y >= 0) {
            y = Math.pow(y, 2);
        } else {
            y = Math.pow(y, 4);
        }
        if (z >= 0) {
            z = Math.pow(z, 2);
        } else {
            z = Math.pow(z, 4);
        }
        System.out.println("x=" + x + '\n' + "y=" + y + '\n' + "z=" + z);
    }
}

