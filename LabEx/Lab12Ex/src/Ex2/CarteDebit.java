package Ex2;

public class CarteDebit extends Carte {
    
    public CarteDebit(String iban, double somme){
        this.iban = iban;
        this.somme = somme;
    }

    public void retirer(double somme){
        if (this.somme > 0 )    
            this.somme -= somme;
        else
            System.out.println("Account is empty"); 
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
