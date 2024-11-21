import java.util.GregorianCalendar;

public class TestBoutique {
    public static void main(String[] args) {
        Boutique b1 = new Boutique();
        Boutique b2 = new Boutique();
        Produit ham = new Produit(10, new GregorianCalendar(2020, 11, 10), 200, "meat");
        Produit sausage = new Produit(20, new GregorianCalendar(2021, 10, 9), 1888, "meat");

        b1.addProduit(ham);
        b2.setProduit(0, sausage);


    }
}
