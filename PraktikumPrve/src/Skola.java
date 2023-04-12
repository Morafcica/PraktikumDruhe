import java.util.ArrayList;

public class Skola {
    private String nazov;
    private ArrayList<Trieda> zoznamTried;
    private ArrayList<Ucitel> zoznamUcitelov;
    public Skola(String nazov) {
        this.nazov = nazov;
        this.zoznamTried = new ArrayList<>();
        this.zoznamUcitelov = new ArrayList<>();
    }

    public void pridajTriedu(Trieda trieda) {
        if (this.zoznamTried.contains(trieda)) {
            System.out.println("Trieda sa tu nachadza");
        } else {
            this.zoznamTried.add(trieda);
        }
    }

    public boolean pridajStudentaDoTriedy(String nazovTriedy, Student student) {
        for (Trieda t : this.zoznamTried) {
            if (t.getNazov().equals(nazovTriedy) && t.pridajStudenta(student)) {
                return true;
            }
        }
        return false;
    }

    public boolean pridajUcitela(Ucitel ucitel) {
        if (this.zoznamUcitelov.contains(ucitel)) {
            return false;
        } else {
            this.zoznamUcitelov.add(ucitel);
            return true;
        }
    }

    public void vypisTried() {
        for (Trieda t : this.zoznamTried) {
            t.vypis();
        }
    }

    public void vypisUcitelov() {
        for (Ucitel u : this.zoznamUcitelov) {
            System.out.println(u.toString());
        }
    }

    public void vypisVsetko() {
        System.out.println(this.nazov);
        this.vypisUcitelov();
        System.out.println();
        this.vypisTried();
    }
}
