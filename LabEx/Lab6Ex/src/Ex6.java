public class Ex6 {
    public static int H(int x,int n){
        if (n == 0)
            return 1;
        if (n == 1)
            return 2*x;
        return 2 * n * H(x, n-1) - 2 * (n-1) * H(x, n-2);      
    }
    public static void main(String[] args) {
        System.out.println(H(2,2));
    }
}
