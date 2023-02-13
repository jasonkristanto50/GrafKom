import java.util.Scanner;
import java.lang.Math;

// Jason Kristanto c14210188

public class Materi2 {
    public static void main(String[] args) {

        int r = 4;
        int pixel = 7;

        String[][] arrayLingkaran = new String[20][20];
        for (int i = 0; i < 360; i+=360/pixel) {
            double rad = Math.toRadians(i);
            long x = Math.round(r*Math.cos(rad))+pixel+r;
            long y = Math.round(r*Math.sin(rad))+pixel+r;

            arrayLingkaran[(int)x][(int)y] = "*";
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (arrayLingkaran[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
