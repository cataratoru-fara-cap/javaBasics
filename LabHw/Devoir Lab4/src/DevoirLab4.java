//import java.util.Arrays;
import java.util.Scanner;

public class DevoirLab4 {
    //ex1 example method
    public static void caser(int args){ 
        int val1 = 1;
        int val2 = 2;
        int val3 = 8;

        switch (args){

            case 1:
                System.out.println(val1 + "case was hit");
                break;
            case 2:
                System.out.println(val2 + "case was hit");
                break;

            case 8:
                System.out.println(val3 + "case was hit");
                break;
    
            default:
                System.out.println("no case was hit");
                break;
        }
    }
    //ex2 a)  Inputer
    public static double[][] inputer(int N){
        double[][] table = new double[N][N];
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    
                    System.out.print("Enter a rational number for line " + i + " column " + j + ": ");
                    table[i][j] = input.nextDouble(); 
                }
            }
        return table;
   }
}
    //ex2 c)
    public static double multiplyEvenHalf(double[][] args){
        double product = 1;
        int modifiableLength = args.length;
        for(int i = 0; i < args.length; i++){
            for (int j = 0; j < modifiableLength; j++){
                if (args[i][j] % 2 == 0) {
                    product *=  args[i][j];
                }
            modifiableLength--;
            }
        }
    return product;
    }

    public static double multiplyEvenFourth(double[][] args){
        double product = 1;
        int start = 0;
        for(int i = 0; i < args.length; i++){
            for (int j = start; j < args.length - start; j++){
                if (args[i][j] % 2 == 0) {
                    product *=  args[i][j];
                }
            if (start == args.length / 2) {break;}
            start++;

            }
        }
    return product;
    }

    public static double sumPosHalf(double[][] args){
        double sum = 0;
        int modifiableLength = args.length;
        for(int i = 0; i < args.length; i++){
            for (int j = 0; j < modifiableLength; j++){
                if (args[i][j] > 0) {
                    sum +=  Math.pow(args[i][j], 2);
                }
            modifiableLength--;
            }
        }
    return sum;
    }

    public static double sumPosFourth(double[][] args){
        double sum = 0;
        int start = 0;
        for(int i = 0; i < args.length; i++){
            for (int j = start; j < args.length - start; j++){
                if (args[i][j] > 0) {
                    sum +=  Math.pow(args[i][j], 2);
                    System.out.println(sum);
                }
            if (start == args.length / 2) {break;}
            start++;
            }
        }
    return sum;
    }
    //ex3 and ex4
    public static double [][] matrixpow(double [][] args1, double [][] args2){
        double [][] c = new double[args1.length][args1.length];
        for( int i = 0; i < args1.length; i++ ){
            for( int j = 0; j < args1.length; j++){
                for (int k = 0; k < args1.length; k++)
                    c[i][j] += args1[i][k] * args2[k][j];
            }
        }
        return c;
    }
    
    public static double [][] matrixsum(double [][] args1, double [][] args2){
        double [][] C = new double[args1.length][args1.length];
        for (int i = 0; i < args1.length; i ++){
            for(int j = 0; j < args1.length; j++)
                C[i][j] += args1[i][j] + args2[i][j];
        }
        return C;
    }
    
    public static double [][] matrixsum(double [][] args1, double [][] args2, double [][] args3){
        double [][] C = new double[args1.length][args1.length];
        for (int i = 0; i < args1.length; i ++){
            for(int j = 0; j < args1.length; j++)
                C[i][j] += args1[i][j] + args2[i][j] + args3[i][j];
        }
        return C;
    }
   
    public static double [][] matrixtranspose(double [][] args){
        double [][] c = new double[args.length][args.length];
        for (int i = 0; i < args.length; i ++){
            for(int j = 0; j < args.length; j++)
                c[j][i] += args[i][j];
        }
        return c;
    }
    public static void main(String[] args) {
        //caser(8);
        //double [][] table = inputer(3);
        //ex 2 b)
        //System.out.println(Arrays.deepToString(table));
        
        //ex 2 c)
        //double a = multiplyEvenHalf(table);
        //double b = multiplyEvenFourth(table);
        //double c = sumPosHalf(table);
        //double d = sumPosFourth(table);

        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        //System.out.println(d);

        //ex 3 and 4
        //double [][] tableSecond = matrixpow(table, table);
        //double [][] tableThird = matrixpow(tableSecond, table);
        //double [][] C = matrixsum(table, tableSecond, tableThird);
        //double [][] transpC = matrixtranspose(C);  
        //System.out.println(Arrays.deepToString(transpC));


    }
}