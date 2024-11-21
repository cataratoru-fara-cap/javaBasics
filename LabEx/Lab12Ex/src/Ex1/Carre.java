package Ex1;
public class Carre extends Forme {
    public int cote;

    public Carre( int cote) {
        this.cote = cote;
    }

    public double surface(){
        return this.cote * this.cote;
    }

    public int perimetre(){
        return this.cote * 4;
    }

    public double diagonale(){
        return this.cote * Math.sqrt(2);
    }
}
