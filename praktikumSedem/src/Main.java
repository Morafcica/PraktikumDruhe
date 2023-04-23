import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria("Vlastu a Boleslava");
        Pizza pizza = new Pizza("nejaka pizza");
        pizza.pridajSurovinu(new Syr(80, 1.9));
        pizza.pridajSurovinu(new Cesto(200.8, 4.1));
        pizzeria.pridajDoPonuky(pizza);
        System.out.println(pizzeria.menu());
        System.out.println(pizzeria.otvaracieHodiny());

        Cukraren cukraren = new Cukraren("U Bosky a Rozenky");
        Kolacik kolacik = new Kolacik("Pomarancovy", 25.8, 75);
        kolacik.pridajAlergen(Alergen.RYBY);
        kolacik.pridajAlergen(Alergen.VLCI_BOB);
        cukraren.pridajDoPonuky(kolacik);
        System.out.println(cukraren.menu());
        System.out.println(cukraren.otvaracieHodiny());

    }
}