package Ex1;
public class Rectangle {
    public int largeur;
    public int longeur;

    public Rectangle( int largeur, int longeur){
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public double surface(){
        return this.longeur * this.largeur;
    }

    public int perimetre(){
        return this.longeur * 2 + this.largeur * 2;
    }

    public double diagonale(){
        double pitagora = this.longeur * this.longeur + this.largeur + this.largeur;
        return Math.sqrt(pitagora);
    }
}
