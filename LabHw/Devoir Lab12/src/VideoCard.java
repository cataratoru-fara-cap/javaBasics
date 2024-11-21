public class VideoCard extends HardwareProduit{
    private static long monnaie = 5;
    private static int maximumNote = 100;

    public VideoCard(double monnaiePrix, double note){
        this.setMonnaiePrix(monnaiePrix);
        this.setNote(note);
    }

    public void calculerPrixLei(){
        this.setLeiPrix( getMonnaiePrix() * VideoCard.monnaie );
    }

    public void calculerPerformance(){
        this.setPerformace( getNote() / VideoCard.maximumNote * 100);
    }
}
