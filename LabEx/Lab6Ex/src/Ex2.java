import java.util.ArrayList;

public class Ex2 {
    public static ArrayList <Integer> p (ArrayList <Integer> a, ArrayList <Integer> b ) {
        ArrayList <Integer> c = new ArrayList<>();
        for (int i = 0; i < a.size(); i++)
            c.add( a.get(i) + b.get(i));
        return c;
    }
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<>();
        System.out.println(p(a, b));
    }
}
