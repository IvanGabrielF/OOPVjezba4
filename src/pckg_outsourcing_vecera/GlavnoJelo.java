package pckg_outsourcing_vecera;

import java.util.concurrent.ThreadLocalRandom;

public class GlavnoJelo {

    float cijena;

    public GlavnoJelo(){
        System.out.println("Servirano glavno jelo!");

    }
    public float totalPrice(){
        return ThreadLocalRandom.current().nextFloat(12,120);

    }
}
