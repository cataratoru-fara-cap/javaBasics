import java.util.Scanner;

public class MatrixMethods {
    public static int diagP(int[][] array) {
        int sum = 0; 
        for (int i = 0; i < array.length; i++) {
                    sum += array[i][i];
            }
        return sum;
    }
    public static int diagS(int[][] array) {
         int sum = 0;
         int j = array.length - 1;
        for (int i = 0 ; i < array.length ; i++) {
                    sum += array[i][j];
                    j--;
        } 
        return sum;
    }
    public static int triangRUp(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) 
            for (int j = i + 1; j < array.length; j++)
                sum += array[i][j];
        return sum;
    }
    public static int triangLDown(int[][] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++)
                sum += array[i][j];
        }
        return sum;
    }
    public static int triangLUp (int [][] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++)
            sum += array[i][j];
        }
        return sum;
    }
    public static int triangRDown (int [][] array) {
        int sum = 0; 
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= array.length - i; j--){ 
                sum += array[i][j];
            }
        }
        return sum;
    }
    
    public static int[][] writeIntMatix(int N, int M) {
        int [][] table = new int[N][M];
        
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < table.length; i++) 
                for (int j = 0; j < table.length; j++) {
                    System.out.println("Insert int at position " + i + " " + j + ": ");
                    table[i][j] = sc.nextInt();                
                }
        }
        return table;
    } 
    public static void main(String[] args) throws Exception {
        int[][] table = writeIntMatix(3, 3);
        System.out.println("\n");
        System.out.println(diagS(table) + "\n");
        //System.out.println(triangLDown(table) + "\n");
        //System.out.println(triangRDown(table) + "\n");
        //System.out.println(triangLUp(table) + "\n");
        //System.out.println(triangRUp(table) + "\n"); 

    }
}
