import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Robot {
    private static final String CESTA = "./src/kroky.txt";
    private Smer aktualnySmer;
    private int pocetKrokov;
    private Obrazok robot;
    private ArrayList<Posun> kroky;

    public Robot() {
        this.kroky = new ArrayList<>();
        this.aktualnySmer = null;
        this.pocetKrokov = 0;
        this.robot = new Obrazok("./src/robot.png");
        this.robot.zobraz();
    }

    public void posun(Smer smer, int oKolko) {
        switch (smer) {
            case DOLE -> {
                this.spravKrok(smer);
                this.robot.pomalyPosunZvisle(oKolko);
            } case HORE -> {
                this.spravKrok(smer);
                this.robot.pomalyPosunZvisle(-oKolko);
            } case VLAVO -> {
                this.spravKrok(smer);
                this.robot.posunVodorovne(-oKolko);
            } case VPRAVO -> {
                this.spravKrok(smer);
                this.robot.posunVodorovne(oKolko);
            }
        }

    }

    public void spravKrok(Smer novySmer) {
        if (this.aktualnySmer == novySmer) {
            this.pocetKrokov++;
        } else {
            this.kroky.add(new Posun(novySmer, this.pocetKrokov));
            this.aktualnySmer = novySmer;
            this.pocetKrokov = 0;
        }

    }

    public void ulozKrokyDoSuboru() {
        this.kroky.add(new Posun(this.aktualnySmer, this.pocetKrokov));
        try {
            File subor = new File(CESTA);
            FileWriter zapisovac = new FileWriter(subor);
            for (Posun posun : this.kroky) {
                String smer = String.valueOf(posun.getSmer());
                int dialka = posun.getoKolko();
                zapisovac.write(smer + " " + dialka + System.lineSeparator());
            }
            zapisovac.close();
        } catch (IOException ignored) {

        }
    }

    public void nacitajUlozeneKroky() {
        ArrayList<Posun> docasny = new ArrayList<>();
        try {
            File subor = new File(CESTA);
            Scanner sc = new Scanner(subor);
            while (sc.hasNext()) {
                String[] veta = sc.nextLine().split(" ");
                String smer = veta[0];
                int dialka = Integer.parseInt(veta[1]);
                Smer s = null;
                switch (smer) {
                    case "HORE" -> s = Smer.HORE;
                    case "DOLE" -> s = Smer.DOLE;
                    case "VPRAVO" -> s = Smer.VPRAVO;
                    case "VLAVO" -> s = Smer.VLAVO;
                }
                docasny.add(new Posun(s, dialka));
            }
            sc.close();
        } catch (IOException ignored) {

        }

        this.vykonaj(docasny);
    }

    public void vykonaj(ArrayList<Posun> nacitaneKroky) {
        for (Posun posun : nacitaneKroky) {
            this.posun(posun.getSmer(), posun.getoKolko());
        }
    }

    public void vymazSubor() {
        try {
            FileWriter zapisovac = new FileWriter(new File(CESTA));
            zapisovac.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void dajNapovodnu() {
        this.robot.zmenPolohu(100, 100);
        this.robot.zobraz();
    }
}
