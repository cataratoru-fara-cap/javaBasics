package Ex2;

public class CarteCredit extends Carte {
    private double creditMaximal;

    public CarteCredit(String iban, double creditMaximal, double somme){
        this.iban = iban;
        this.creditMaximal = creditMaximal;
        this.somme = somme;
    }

    public void retirer(double somme){
        if (this.somme - somme > creditMaximal)
            this.somme -= somme;
        else
            System.out.println("Cannot Withdreaw, exedes card limit");
    }

    @Override
    public String toString() {
        return super.toString() + " CarteCredit [creditMaximal=" + creditMaximal + "]";
    }
    
}
