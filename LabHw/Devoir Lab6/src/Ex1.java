public class Ex1 {
    public static int numAp(String str, char c) {
        int l = 0; int r =  str.length();
        int midpoint = l + (r - l) / 2;
        if (str.length() == 1){    
            if (c == str.charAt(midpoint))
                return 1;
            return 0;
            }
        return numAp(str.substring(l, midpoint), c) + numAp(str.substring(midpoint, r), c);
        
        }
    public static void main(String[] args) {
        System.out.println(numAp("Ana are Mere", 'a'));
    }
}
