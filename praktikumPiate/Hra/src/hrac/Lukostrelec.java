package hrac;

import nepriatelia.Kopijnik;
import nepriatelia.Nepriatel;
import postava.Postava;
import tvary.Obrazok;

import java.util.ArrayList;

public class Lukostrelec extends Postava {

    public Lukostrelec(int poziciaX, int poziciaY) {
        super(23, "luk");
        this.obrazok.zmenPolohu(poziciaX, poziciaY);
    }

    public void vystrelNa(ArrayList<Nepriatel> nepriatelia) {
        if ((nepriatelia.size() == 0) || (this.animacia % 23 != 22)) return;

        int mojY = this.obrazok.getPolohaY();
        Nepriatel najblizsi = nepriatelia.get(0);
        int najmensiRozdiel = Math.abs(najblizsi.getY() - mojY);

        for (int i = 1; i < nepriatelia.size(); i++) {
            int rozdiel = Math.abs(nepriatelia.get(i).getY() - mojY);
            if (rozdiel < najmensiRozdiel) {
                najmensiRozdiel = rozdiel;
                najblizsi = nepriatelia.get(i);
            }
        }

        if (najblizsi.uberHp(25)) {
            if (najblizsi instanceof Kopijnik kopijnik) {
                kopijnik.skryKopiju();
            }
            nepriatelia.remove(najblizsi);
        }
    }
}
