package pckg_osnovni_vecera;

public class Predjelo {
    protected String naziv;
    protected String vrsta;
    protected int kolicina;

    public Predjelo(String naziv, String vrsta, int kolicina){
        this.naziv=naziv;
        this.kolicina=kolicina;
        this.vrsta = vrsta;
    }
    public void pojediPredjelo(){
        System.out.println("Predjelo pojedeno: " + getClass().getSimpleName() + " -> " + naziv + " -> " + " količina " + kolicina);

    }
    int kojaKolicina(){
        return kolicina;
    }
}
