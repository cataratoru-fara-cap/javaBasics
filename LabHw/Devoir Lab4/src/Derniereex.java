public class Derniereex {
    public static boolean isprime(int n){
        boolean response = false;
        
        if (n == 0){ return false;}

        for ( int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                response = true;
                break;
            }
        }

        if (!response) {return true;}
        else {return false;}
    }
    
    public static void textParser(String args){
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String lower = args.toLowerCase();
        char [] arr = lower.toCharArray();
        int [] vect = new int[26]; //length of the english alphabet
        
        for (char element: arr){
            int i = alphabet.indexOf(element);
            vect[i] += 1;
            }

        String [] finalarray = new String[26];
        for (int i = 0; i < 26; i++){
            if (isprime(vect[i])) {
                finalarray[i] = String.format("%1$c appears %2$d times", alphabet.charAt(i), vect[i]);
                System.out.println(finalarray[i]);
            }

        }
    }
    
    public static void main(String[] args){
        textParser("aaaaaaBbccddd");
    }
}