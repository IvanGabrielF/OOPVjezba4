package pckg_outsourcing_vecera;

public class Desert {
    private String naziv;
    private int kolicina;

    public Desert(String naziv, int kolicina){
        this.kolicina = kolicina;
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "naziv='" + naziv + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }

    public void infoDesert(){
        System.out.println(this);
    }
}
