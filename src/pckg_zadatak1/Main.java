package pckg_zadatak1;

public class Main {
    public static void main(String[] args) {

        Semafor semafor = new Semafor();
        Haker haker = new Haker(semafor);

        System.out.println(semafor);
        semafor.giveSemaforStatus();
        semafor.putSemaforInWork();
        haker.changeSemaforCode("010");
        semafor.putSemaforInWork();

    }
}
