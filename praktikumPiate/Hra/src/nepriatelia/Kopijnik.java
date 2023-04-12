package nepriatelia;

import hrac.Lukostrelec;
import tvary.Obrazok;

import java.util.ArrayList;

public class Kopijnik extends Nepriatel {
    private Kopija kopija;
    public Kopijnik(int poziciaY, int rychlost) {
        super(7, "kopija", poziciaY, rychlost);
    }

    @Override
    public void zautoc(ArrayList<Lukostrelec> lukostrelci) {
        if (this.kopija == null) {
            this.kopija = new Kopija(500, this.obrazok.getPolohaX(), this.obrazok.getPolohaY());
        }

        if (!this.kopija.let()) {
            this.kopija.skry();
            this.kopija = null;
        }


        for (int i = 0; i < lukostrelci.size(); i++) {
            int vzdialenost = lukostrelci.get(i).getObrazok().getPolohaX() - this.obrazok.getPolohaX();
            if (vzdialenost <= 20) {
                lukostrelci.get(i).getObrazok().skry();
                lukostrelci.remove(i);
            }
        }
    }

    public void skryKopiju() {
        this.kopija.skry();
    }
}
