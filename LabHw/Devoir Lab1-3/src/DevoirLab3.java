public class DevoirLab3 {
    //Ex1
    public static void Quadratic(double a, double b, double c){
        double delta = b*b - 4 * a * c;
        
        if (delta == 0) { 
            double x = (-b / (2 * a));
            System.out.println("Equation has single sol " + x);

        }
        else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Equation has double sol" + x1 + " " + x2);

        }
        else {
            System.out.println("We solve only for Rational values of R, given a, b, c parameters lead to a complex solution");
        }

    }
    //Ex2
    public static void piramidprint(int N){

        String[] dots = new String[N];
        dots[0] = ".";

        System.out.println(dots[0]);

        for( int i = 1; i < N; i++){
            dots[i] = dots[i - 1] + " .";
            System.out.println(dots[i]);

        }
        System.out.println();

        for(int i = dots.length - 1; i >= 0; i--){
            System.out.println(dots[i]);
        }
    } 
    //Ex3
    public static String isprime(int n){
        boolean response = false;
        
        for ( int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                response = true;
                break;
            }
        }

        if (!response) {return "number is prime";}
        else {return "number is not prime";}
    }
    //Ex4
    public static void series(int n){
        int sum = 0;
        int nCopy = n;
        for (int i = 1; i <= n; i++){
            sum += i * (nCopy);
            nCopy--;
        }
        System.out.println(sum);
    }
    //Ex5
    public static void sieveOfErathosenes(int n){
        boolean [] sieve = new boolean[n + 1];
        for (int i = 0; i<= n; i++)
            sieve[i] = true;
        
        for(int p = 2; p * p <= n; p ++){
             if (sieve[p] == true){
                for (int np = p * p; np <= n; np += p)
                    sieve[np] = false;
            }
        }
        for (int i = 1; i <= n; i++){
            if (sieve[i] == true) {System.out.println(i + " ");}
        }
    }
    //Ex6
    public static void perfectNumberFinder(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++)
            if (n % i == 0) {sum += i;}   
        
        if (n == sum) {System.out.println(n);}
    }    
    public static void findAllPerfectNumbersInRange(int n){
        for (int i = 2; i <=n; i++)
            perfectNumberFinder(i);

    }
    public static void main(String[] args){
        //Uncomment for each exercise output
        
        //Quadratic(1, 8, 3);
        //piramidprint(3);
        //System.out.println(isprime(10));
        //series(3);
        //sieveOfErathosenes(10);
        //findAllPerfectNumbersInRange(30);

    }
}
