public class Moniteur extends HardwareProduit {
    private static long monnaie = 5;
    private static int maximumNote = 100;

    public Moniteur(double monnaiePrix, double note){
        this.setMonnaiePrix(monnaiePrix);
        this.setNote(note);
    }

    public void calculerPrixLei(){
        this.setLeiPrix( getMonnaiePrix() * Moniteur.monnaie );
    }

    public void calculerPerformance(){
        this.setPerformace( getNote() / Moniteur.maximumNote * 100 );
    }

}
