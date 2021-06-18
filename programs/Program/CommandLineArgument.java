public class CommandLineArgument {
    public static void main(String[] args){
        int sum = sum(args);
        System.out.println(sum); 
    }

    static int sum(String[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + Integer.parseInt(a[i]);
        }
        return sum;
    }
}
