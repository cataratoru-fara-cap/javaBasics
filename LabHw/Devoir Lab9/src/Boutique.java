import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Boutique {
    public ArrayList<Produit> liste = new ArrayList<>();

    public void addProduit(Produit myProduit) {
        if (liste.size() < 50)
            liste.add(myProduit);
        else
            System.out.println("Cannot sell anymore products");
    }

    public void setProduit(int index, Produit myProduit) {
        liste.set(index, myProduit);
    }

    public String setProduitPrix(long code, double newPrix) {
        for (Produit prod : liste)
            if (prod.getId() == code) {
                prod.setPrix(newPrix);
                return "Found product with code " + code + " and changed the price";
            }
        return "Product with code " + code + " not found";
    }
    
    public void printProductsOfCat(String categorie) {
        for (Produit produit : liste)
            if (produit.getCategorie() == categorie)
                System.out.println(produit.toString());
    }
    
    public void printExpiredProduct(String currDate) {
        LocalDate currentDate = LocalDate.parse(currDate);
        for (Produit produit : liste) {
            LocalDate productionDate = LocalDate.parse(produit.getDateProduction());
            if (produit.getValidite() < ChronoUnit.DAYS.between(productionDate, currentDate))
                System.out.println(produit.toString());
        }
    }
    
    public void moiCherProd() {
        int cheapestProduitid = liste.get(0).getId();
        double min = liste.get(0).getPrix();
        for (Produit produit : liste) {
            if (produit.getPrix() < min) {
                min = produit.getPrix();
                cheapestProduitid = produit.getId();
            }
            System.out.println("Cheapest product has id" + cheapestProduitid + " and price" + min);
        }
    }

    public double meanPrice3Annes() {
        double mean = 0;
        for (Produit produit : liste) {
            LocalDate dateProd = LocalDate.parse(produit.getDateProduction());
            LocalDate threeYearsAgo = LocalDate.now().minusYears(3);
            if (dateProd.isAfter(threeYearsAgo) || dateProd.isEqual(threeYearsAgo))
                mean += produit.getPrix();
        }       
        return mean / liste.size();
    }
}
