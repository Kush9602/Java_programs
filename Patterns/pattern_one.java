// way 1 (my code)
public class pattern_one{
    public static void main(String[] args){

        for(int i = 1; i <= 10; i++){
            System.out.print("0 ");
            for(int j = 1; j < i; j++){
                System.out.print(j*(i- 1) + " ");  
                
            }
            System.out.println();   
        }
           
    }
}


// Way 2 (Shadab's code)

// public class pattern_one {
//     public static void main(String[] args){
//         int c;
//         for(int i = 1; i<=10; i++){
//             c=0;
//             for(int j = 1; j <= i; j++){ 
//                 System.out.print(c+" ");
//                 c=c+i-1;
                
//             }
//             System.out.println();
//         }
//     }
// }
