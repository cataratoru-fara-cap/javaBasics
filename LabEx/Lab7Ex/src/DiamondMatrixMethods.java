
public class DiamondMatrixMethods {
    public static void diamondL(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i > j) && (i + j < arr.length - 1)) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void diamondU(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j > i) && (i + j < arr.length - 1)) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void diamondR(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j > i) && (i + j > arr.length - 1))
                    sum += arr[i][j];
                // System.out.println(arr[i][j]);
            }
        }
        System.out.println(sum);
    }

    public static void diamondD(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i > j) && (i + j > arr.length - 1))
                    sum += arr[i][j];
                // System.out.println(arr[i][j]);
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // int[][] B = MatrixMethods.writeIntMatix(4, 4);
        int[][] B = { { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 }

        };
        diamondD(B);
    }
}