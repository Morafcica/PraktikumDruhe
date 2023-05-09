import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class Obchod {
    private HashMap<String, Potravina> potraviny;
    private ArrayList<Clovek> zoznamLudi;

    public Obchod() {
        this.potraviny = new HashMap<>();
        this.zoznamLudi = new ArrayList<>();
    }

    public void pridajPotravinu(Potravina potravina, String id) {
        this.potraviny.put(id, potravina);
    }

    public void pridajCloveka(Clovek clovek) {
        this.zoznamLudi.add(clovek);
    }

    public void vypisPotraviny() {
        for (Potravina p : this.potraviny.values()) {
            System.out.println(p.toString());
        }
    }

    public void vypisLudi() {
        for (Clovek clovek : this.zoznamLudi) {
            System.out.println(clovek.toString() + " " + clovek.vypisCinnost());
        }
    }

    public Optional<Potravina> obsahujeKod(String kod) {
        return Optional.ofNullable(this.potraviny.get(kod));
    }

    public int pocetPotravin() {
        return this.potraviny.size();
    }

    public void vymazPotravinu(String kod) {
        this.potraviny.remove(kod);
    }

    public void zapisPotraviny() {
        File subor = new File("./src/potraviny.txt");
        try {
            FileWriter zapisovac = new FileWriter(subor, true);
            for (Potravina p : this.potraviny.values()) {
                String riadok = p.toString();
                zapisovac.write(riadok + "\n");
            }
            zapisovac.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void nacitajPotraviny() {
        File subor = new File("./src/potraviny.txt");

        try {
            Scanner sc = new Scanner(subor);
            while (sc.hasNextLine()) {
                String riadok = sc.nextLine();
                String[] slova = riadok.split(" ");

                TypPotraviny typ = null;
                String id = slova[0];
                String nazov = slova[2];
                double hmotnost = Double.parseDouble(slova[3]);
                boolean trvanliva = Boolean.parseBoolean(slova[4]);
                switch (slova[1]) {
                    case "OVOCIE" -> {
                        typ = TypPotraviny.OVOCIE;
                    } case "ZELENINA" -> {
                        typ = TypPotraviny.ZELENINA;
                    } case "MASO" -> {
                        typ = TypPotraviny.MASO;
                    } case "PECIVO" -> {
                        typ = TypPotraviny.PECIVO;
                    }
                }

                Potravina potravina = new Potravina(typ, nazov, hmotnost, trvanliva);
                this.pridajPotravinu(potravina, id);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
