import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matica matica = new Matica();

        int[][] matA = new int[3][3];
        int[][] matB = new int[4][4];
        int[] pole = new int[2];
        pole[0] = 1;
        pole[1] = 1;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matA[i][j] = 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matB[i][j] = 1;
            }
        }



        System.out.println(matica.dajDlzkuRetazca(null));

        System.out.println("Over parnost: ");
        matica.overParnost();

        System.out.println("Scitaj matice: ");
        try {
            matica.sciatajMatice(matA, matB);
        } catch (NerovnostStranException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Vypocitaj median");
        try {
            matica.vypocitajMedian();
        } catch (ParnyPocetException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Vydel: ");
        try {
            matica.vydel();
        } catch (ZaporneCisloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Vypis prvok pola: ");
        matica.vypisPrvokPola(pole, 3);
    }
}