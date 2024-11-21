
public class Ex4 {
    public static int[] Concatenator(int [] args1, int [] args2){
        int [] args = new int[args1.length + args2.length];
        for (int i = 0; i < args1.length; i++)
            args[i] += args1[i];
        
        for (int i = args1.length; i < args.length; i++ )
            args[i] += args2[i - args1.length];
        
        return args;
    
}   
    public static void printer(int [] args){
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);

    }

    public static void main(String[] args) {
        int [] args1 = {1,2,3,4};
        int [] args2 = {1,2,3,4};
        printer(Concatenator(args1, args2));
    }
    
}
