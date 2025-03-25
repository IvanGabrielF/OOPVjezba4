package pckg_zadatak1;

public class Semafor {
    private String red;
    private String yellow;
    private String green;

    private String code;

    private static final String[] CODES = {"100","010","001"};

    public Semafor(){
        this.green = "1";
        this.yellow = "0";
        this.red = "0";
        this.code = this.green+this.yellow+this.red;
    }

    public Semafor(String gr, String ye, String re){
        this.red = re;
        this.yellow = ye;
        this.green = gr;
        this.code = this.green+this.yellow+this.red;

    }


    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
        this.code = this.green+this.yellow+this.red;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
        this.code = this.green+this.yellow+this.red;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
        this.code = this.green+this.yellow+this.red;
    }

    @Override
    public String toString() {
        return "Semafor{" +
                "red='" + red + '\'' +
                ", yellow='" + yellow + '\'' +
                ", green='" + green + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    private boolean checkCode(){
        for (String kod : CODES){
            if (code.equals(kod)){
                return true;
            }
        }
        return false;
    }
    public void giveSemaforStatus(){
        if (checkCode()){
            switch (code){
                case "100" -> System.out.println("prolaz");
                case "010" -> System.out.println("oprez");
                case "001" -> System.out.println("stop");
                default -> System.out.println("Greška");
                //smatram da je ovo bolje riješenje za ovaj slučaj nego switch sa breakom
            }
        }else {
            System.out.println("Pogrešan kod semafora!");
        }

    }
    public void putSemaforInWork(){
        int cnt = 0;
        while (cnt<10) {
            giveSemaforStatus();
            int idx = (cnt + 1) % 3;
            System.out.println(idx);
            this.code = CODES[idx];
            cnt++;
        }
    }


}
