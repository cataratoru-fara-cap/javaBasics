public class Ex1 {
    public static String inverser (String str){
        char[] chararr = str.toCharArray();
        String new_str = "";
        for (int i = chararr.length - 1; i >= 0; i--)
            new_str += chararr[i]; 
        return new_str;
    }
    public static void main(String[] args) {
        System.out.println(inverser("nata"));
    }
}
