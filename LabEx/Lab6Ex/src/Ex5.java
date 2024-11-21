public class Ex5 {
    public static int somme(int n) {
        
        if (n == 0 ) {return 0;}
        return n % 10 + somme(n/10);
    }
    public static void main(String[] args) {

    }
}
