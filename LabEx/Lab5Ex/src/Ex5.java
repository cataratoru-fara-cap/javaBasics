public class Ex5 {
    public static int factorial(int fact){
        int arg = 1;
        for(int i = 1; i <= fact; i++){
            arg *= i;
        }
        return arg;
    } 

    public static int aranjament(int n, int k){
        return factorial(n)/factorial(n-k);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(aranjament(6, 4));

    }
}
