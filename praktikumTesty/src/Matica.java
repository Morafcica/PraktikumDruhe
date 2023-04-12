import java.util.*;

public class Matica {

    public Matica() {

    }

    public int dajDlzkuRetazca(String retazec) throws NullPointerException {
        try {
            return retazec.length();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        return -1;
    }


    public int[][] sciatajMatice(int[][] matA, int[][] matB) throws NerovnostStranException {

        if (matA.length != matB.length || matA[0].length != matB[0].length) {
            throw new NerovnostStranException("Nerovny pocet stran matic");
        }

        int[][] novaMatica = new int[matA.length][matA[0].length];

        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[0].length; j++) {
                novaMatica[i][j] = matA[i][j] + matB[i][j];
            }
        }

        return novaMatica;
    }

    public boolean overParnost() {
        Scanner sc = new Scanner(System.in);
        try {
            if (sc.nextInt() % 2 == 0) {
                System.out.println("Cislo je parne");
                return true;
            } else {
                System.out.println("Nie je parne");
                return false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Zadal si String nie int");
        }

        return false;
    }

    public int vydel() throws ZaporneCisloException {
        Scanner sc = new Scanner(System.in);

        int druhy = 0;
        int prvy = 0;
        try {
            prvy = sc.nextInt();
            druhy = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("naco davas String");
        }

        try {
            return prvy / druhy;
        } catch (ArithmeticException e) {
            System.out.println("Nulou sa delit neda");
        }

        if (druhy < 0) {
            throw new ZaporneCisloException("Cislo je zaporne");
        }
        
        return 0;

    }

    public void vypocitajMedian() throws ParnyPocetException {
        ArrayList<Integer> zoznamCisel = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int cislo = sc.nextInt();
                zoznamCisel.add(cislo);
            } catch (InputMismatchException e) {
                break;
            }
        }

        if (zoznamCisel.size() % 2 == 0) {
            throw new ParnyPocetException("Zadal si parny pocet cisel");
        }

        Collections.sort(zoznamCisel);

        System.out.println(zoznamCisel.get(zoznamCisel.size() / 2));
    }

    public int vypisPrvokPola(int[] pole, int pozicia) {
        try {
            return pole[pozicia];
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }


}
