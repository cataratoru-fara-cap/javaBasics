import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Parking {
    public ArrayList<Voiture> parked;
    
    public Parking(ArrayList <Voiture> parked) {
        this.parked = parked;
    }
    
    public boolean addVoiture(Voiture voiture) {
        parked.add(voiture);
        return true;
    }

    public boolean retirerVoiture(int index) {
        if (index < parked.size()) {
            parked.remove(index);
            return true;
        }
        return false;
    }

    public boolean modifierPaysProduction(int code, String pays) {
        for (Voiture voiture : parked)
            if (voiture.getCodeUnique() == code) {
                voiture.setPaysProduction(pays);
                return true;
            }
        return false;
    }

    public void affichezParMarque(String marque) {
        for (Voiture voiture : parked)
            if (voiture.getMarquete() == marque)
                System.out.println(voiture.toString());
    }
    
    public void affichezParPays(String pays) {
        for (Voiture voiture : parked)
            if (voiture.getPaysProduction() == pays)
                System.out.println(voiture.toString());
    }

    public void troveVoituresFabriquesDeuxDernieresAnnees() {
        GregorianCalendar twoYearsAgo = new GregorianCalendar();
        twoYearsAgo.add(Calendar.YEAR, -2);

        for (Voiture voiture : parked)
            if (voiture.getDateFabrication().after(twoYearsAgo.getTime()))
                System.out.println(voiture.toString());
    }

    public Voiture plusChereVoiture() {
        Voiture cher_voiture = parked.get(0);
        double max = parked.get(0).getPrix();
        for (Voiture voiture : parked) 
            if (voiture.getPrix() > max) {
                max = voiture.getPrix();
                cher_voiture = voiture;
            }
        return cher_voiture;
        
    }
    public double prixMoyene(String marque) {
        double mean = 0;
        for (Voiture voiture : parked)
            if (voiture.getMarquete() == marque)
                mean += voiture.getPrix();

        return mean / parked.size();
    }
    
}
