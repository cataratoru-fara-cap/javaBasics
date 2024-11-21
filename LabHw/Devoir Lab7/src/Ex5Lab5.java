public class Ex5Lab5 {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        int arg = 1;
        for (int i = 1; i <= num; i++) {
            arg *= i;
        }
        return arg;
    }
    
    public static int doublefactorial(int num){
        if (num == 0) {
            return 1;
        }
        else if (num % 2 == 0) {
            int arg = 1;
            for (int i = 2; i <= num ; i += 2) 
                arg *= i;
            return arg;
        
        } else {
            int arg = 1;
            for (int i = 1; i <= num; i += 2) 
                arg *= i;
            return arg;
        }    
    } 

    public static int combinari(int n, int k){
        return factorial(n)/( factorial(n-k) * factorial(k) );
    }

    public static void main(String[] args) {
    
    }
}
