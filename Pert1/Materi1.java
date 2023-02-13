import java.util.Scanner;
import java.lang.Math;

// Jason Kristanto c14210188


public class Materi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan posisi awal dan akhir X");
        int posisiXawal = input.nextInt();
        int posisiXakhir = input.nextInt();

        System.out.println("Masukkan posisi awal dan akhir Y");
        int posisiYawal = input.nextInt();
        int posisiYakhir = input.nextInt();

        double dX = posisiXakhir - posisiXawal;
        double dY = posisiYakhir - posisiYawal;

        // dX acuan loop
        double incX = dX / dX;
        double incY = dY / dX;

        int ukuranArray = 0;
        if(posisiYakhir >= posisiXakhir){
            ukuranArray = posisiYakhir;
        }
        else{
            ukuranArray = posisiXakhir;
        }

        String[][] array2D = new String[ukuranArray][ukuranArray];
        for (int i = 0; i < ukuranArray; i++) {
            for(int j = 0; j < ukuranArray; j++){
                array2D[i][j] = " ";
            }
        }

        // for(String[] i : array2D){
        //     for(String j : i){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for(int i = 0; i < dX; i++){
            double x = posisiXawal + Math.round(incX * i);
            double y = posisiYawal + Math.round(incY * i);

            for(int j = 0; j <= y; j++){
                if(j == y){
                    array2D[i][j] = "*";
                }
                // else{
                //     array2D[i][j] = " ";
                // }
            }
        }
        
        for(String[] i : array2D){
            for(String j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}