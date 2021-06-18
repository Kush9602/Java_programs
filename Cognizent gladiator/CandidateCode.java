import java.io.*;
public class CandidateCode {
    public static void main(String args[] )throws IOException{
    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        for(int i = 0; i < n; i++){
            String primeSet[] = read.readLine().split(" ");
            int lR = Integer.parseInt(primeSet[0]);
            int uR = Integer.parseInt(primeSet[1]);
            maxDifference(lR, uR);
        }         
   }

   static void maxDifference(int lRange, int uRange){
        int prime[] = minANDmaxPrime(lRange, uRange);
        
        if(prime[0] == 0 && prime[1] == 0)
            System.out.println(-1);
        else if(prime[0] == prime[1])
            System.out.println(0);
        else
            System.out.println(prime[1]-prime[0]);
   }

   static int[] minANDmaxPrime(int l, int u){
        int prime[] = {0,0};        //prime[0] => lowest prime no , whereas prime[1] => highest prime no.

        for(int i = l; i <= u; i++){    // check for lowest prime no and store to prime[0]
            int flag = 0;
            if(i == 0 || i == 1)
                continue;
            else{
                for(int j = 2; j <= i/2; j++){
                    if(i%j==0){
                        flag = 1;
                        break;
                    }
                }
            }
            
            if(flag == 0){
                prime[0] = i;
                break;
            }
       }

        for(int i = u; i >= l; i--){     // check for highest prime no and store to prime[1]
            int flag = 0;
            if(i == 0 || i == 1)
                continue;
            else{
                for(int j = 2; j <= i/2; j++){
                    if(i%j==0){
                        flag = 1;
                        break;
                    }
                }
            }
            
            if(flag == 0){
                prime[1] = i;
                break;
            }
       }

       return prime;
   }
}