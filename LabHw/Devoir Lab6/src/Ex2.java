import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    
    public static int[] inputer(int N){
        int[] arr = new int[N]; 
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < N; i++){    
                    System.out.print("Enter an integer number: ");
                    arr[i] += input.nextInt(); 
                 }
        return arr;
        }
    }

    public static ArrayList<Integer> deDuplicator (ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++){
                if (arr.get(i) == arr.get(j))
                    arr.remove(j);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = inputer(6);
        ArrayList<Integer> new_arr = new ArrayList<>(); 
        for (int item: arr)
            new_arr.add(item);
                 
        System.out.println(deDuplicator(new_arr));
    }
}
