public class Ex4 {
    public static int cmmdc(int a,int b) {
        if( b == 0){
            return a;
        }
  
        return cmmdc(b, a % b);
        }
    
    public static void main(String[] args) {
        System.out.println(cmmdc(5,15));
    }
}
