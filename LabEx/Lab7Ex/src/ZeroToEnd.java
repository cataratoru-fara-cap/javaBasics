public class ZeroToEnd {
    public static int[] arrange(int[] arr){
        int counter = 0;
        int[] dummy = new int[arr.length];
        
        for (int i = 0; i < dummy.length; i++) {
            if(arr[i] != 0){
                dummy[counter] = arr[i];
                counter++;

            }
        }
        for (int i = counter; i < arr.length; i++) {
            dummy[i] = 0;
        }
        return dummy;
    }
    public static void main(String[] args) {
        int [] arr = {0, 0, 2, 0, 3, 5, 7, 0, 9, 0};
        arr = arrange(arr);
        for (int i : arr) {
           System.out.println(i);
        }
    }
}
