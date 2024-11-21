public class Manager extends Employe {
    
    public Manager(String nom){
        super(nom);
    }

    public double calculerSalaire(){
        return 4000 + calculerBugetTotal() * 10 / 100;
    }
}
