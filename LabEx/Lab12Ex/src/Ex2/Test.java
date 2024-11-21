package Ex2;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Adresse a1 = new Adresse("paris", "fleurs", 9);
        CarteCredit cc1 = new CarteCredit("122234adsdf1234", 1125);
        CarteDebit cd1 = new CarteDebit("1234gdfb1342512", 1200);
        Client c1  = new Client("Gabi", new GregorianCalendar(1990, 10, 20), "1910238492", a1);

        System.out.println(c1.ajouterCarte(cd1));
        System.out.println(c1.ajouterCarte(cc1));

        c1.afficerDetail();
        
        cc1.retirer(1900);
        
        cd1.retirer(900);

        c1.afficerDetail();
        c1.supprimerCarte("122234adsdf1234");

        c1.afficerDetail();
    }
}
