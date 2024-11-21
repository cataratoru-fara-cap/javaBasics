public abstract class HardwareProduit {
    private double monnaiePrix;
    private double leiPrix;
    private double note;
    private double performance;

    public abstract void calculerPerformance();
    public abstract void calculerPrixLei();
    
    public double calculerRapportLeiPrixPerformance(){
        return this.leiPrix / this.performance;
    }
    

    public double getMonnaiePrix() {
        return monnaiePrix;
    }
    public void setMonnaiePrix(double monnaiePrix) {
        this.monnaiePrix = monnaiePrix;
    }

    public double getNote() {
        return note;
    }
    public void setNote(double note) {
        this.note = note;
    }
    
    public void setPerformace(double performace) {
        this.performance = performace;
    }

    public void setLeiPrix(double leiPrix) {
        this.leiPrix = leiPrix;
    }

    @Override
    public String toString() {
        return "HardwareProduit [monnaiePrix=" + monnaiePrix + ", leiPrix=" + leiPrix + ", note=" + note
                + ", performace=" + performance + "]";
    }
    
}
