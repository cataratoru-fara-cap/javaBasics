public class Palindrom {
    public static boolean pal(String word){
        word = word.toLowerCase();
        char [] chars = word.toCharArray();
        int k = chars.length - 1;
        for (int i = 0; i < chars.length / 2 ; i++)
            if (chars[i] != chars[k])
                return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(pal("ani"));
    }
}