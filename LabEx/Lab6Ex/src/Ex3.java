import java.util.ArrayList;

public class Ex3 {
    public static int minArray(ArrayList<Integer> v){
        int min = v.get(0);
        for(int i = 0; i<v.size(); i++){
            if (v.get(i) < min) {
                min = v.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(12); v.add(13); v.add(18); v.add(19);
        System.out.println(minArray(v));
    }
}
