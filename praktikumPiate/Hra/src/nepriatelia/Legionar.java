package nepriatelia;

import hrac.Lukostrelec;
import postava.Postava;

import java.util.ArrayList;

public class Legionar extends Nepriatel {
    public Legionar(int poziciaY, int rychlost) {
        super(7, "mec", poziciaY, rychlost);
    }

    @Override
    public void zautoc(ArrayList<Lukostrelec> lukostrelci) {

        for (int i = 0; i < lukostrelci.size(); i++) {
            var mojaX = this.obrazok.getPolohaX();
            var mojaY = this.obrazok.getPolohaY();
            var lukX = lukostrelci.get(i).getObrazok().getPolohaX();
            var lukY = lukostrelci.get(i).getObrazok().getPolohaY();

            var vzdialenost = Math.sqrt((Math.pow((lukX - mojaX), 2)) + (Math.pow((lukY - mojaY), 2)));

            if (vzdialenost <= 15) {
                this.obrazok.zmenPolohu(this.obrazok.getPolohaX(), lukostrelci.get(i).getObrazok().getPolohaY());
                lukostrelci.get(i).getObrazok().skry();
                lukostrelci.remove(i);
            }
        }

    }
}
