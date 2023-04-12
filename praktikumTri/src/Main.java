public class Main {

        public static void main(String[] args) {
                Husenica hus = new Husenica();
                Clanok cl = new Clanok();
                cl.setVykonavac(new Prefarbovac(cl. getKruh()));
                hus.pridajClanok(cl);
                hus.pridajClanok(new Clanok(new PosuvacVpred(hus)));
                hus.pridajClanok(new Clanok(new Odbocovac(true, hus)));
                hus.pridajClanok(new Clanok(new PosuvacVpred(hus)));
                hus.pridajClanok(new Clanok(new PosuvacVpred(hus)));
                hus.pridajClanok(new Clanok(new Odbocovac(false, hus)));
                hus.pridajClanok(new Clanok(new PosuvacVpred(hus)));
                hus.pridajClanok(new Clanok(new PosuvacVpred(hus)));
                hus.spracuj();
        }


}