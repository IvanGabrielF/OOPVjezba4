package pckg_zadatak1;

public class Haker {

    private Semafor semafor;

    public Haker(){

    }

    public Haker(Semafor semafor){
        this.semafor = semafor;

    }

    public Semafor getSemafor() {
        return semafor;
    }

    public void setSemafor(Semafor semafor) {
        this.semafor = semafor;
    }

    public void changeSemaforCode(String codeNew){
        char[] chars = codeNew.toCharArray();
        semafor.setGreen(String.valueOf(chars[0]));
        semafor.setRed(String.valueOf(chars[1]));
        semafor.setRed(String.valueOf(chars[1]));


    }
}
