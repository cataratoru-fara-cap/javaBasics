public class Programeur extends Employe{
    public Programeur(String nom){
        super(nom);
    }

    public double calculerSalaire(){
        return 3000 + getNombreDeProjets() * 500;
    }
}
