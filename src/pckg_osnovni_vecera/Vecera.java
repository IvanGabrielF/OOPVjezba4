package pckg_osnovni_vecera;

import pckg_outsourcing_vecera.Desert;
import pckg_outsourcing_vecera.GlavnoJelo;

public class Vecera {
    public static void main(String[] args) {

        Predjelo predjelo = new Predjelo("Plata","Pršut-sir",4);
        GlavnoJelo glavnoJelo = new GlavnoJelo();
        Desert desert = new Desert("Mađarica",8 );
        predjelo.pojediPredjelo();
        float cijena = glavnoJelo.totalPrice();

    }
}
