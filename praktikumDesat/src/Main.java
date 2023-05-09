public class Main {
    public static void main(String[] args) {
        Obchod obchod = new Obchod();
        obchod.nacitajPotraviny();
        obchod.vypisPotraviny();

        obchod.pridajCloveka(new Predavac("Richard", "Zibek", 1945, true));
        obchod.pridajCloveka(new Zakaznik("Bambus", "Bambus"));
        obchod.pridajCloveka(new Zakaznik("BAkaba", "fakaba"));
        obchod.vypisLudi();
    }
}