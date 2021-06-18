import java.io.*;
public class corona {
    public static void main(String args[])throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String VirusCompo = reader.readLine().toLowerCase();
        int n = Integer.parseInt(reader.readLine());
        String bloodList[] = new String[n];
        for(int i = 0; i < n; i++)
            bloodList[i] = reader.readLine().toLowerCase();

        String VirusArr[] = VirusCompo.split("");
        
        for(int i = 0; i < bloodList.length; i++)
            checkInfection(VirusArr, bloodList[i]);
    }
  
    static void checkInfection(String virus[] , String blood){

        String bloodArr[] = blood.split("");
        int count[] = new int[bloodArr.length];
        int c = 0;
        for(int i = 0; i < bloodArr.length; i++){
            for(int j = c; j < virus.length; j++){
                if(bloodArr[i].equals(virus[j])){
                    count[i] = 1;
                    c = j;
                    break;
                }  
            }

            if(count[i] != 1){
                System.out.println("NEGATIVE");
                break;
            }        
        }

        if(count[bloodArr.length - 1] == 1)   
            System.out.println("POSITIVE");

    } 
}
