public class TowerOfHanoi { 
    public static void main(String[] args){
        int disk = 3;
        String sou = "SOURCE", aux = "AUXILARY", des = "DESTINATION";

        towerOfHanoi(disk, sou, des, aux);
    }


    private static void towerOfHanoi(int disk, String sou, String des, String aux){
        if(disk == 0)
            return;

        towerOfHanoi(disk - 1, sou, aux, des);
        System.out.println("DISK " + disk + " move from " + sou + " --> " + des);
        towerOfHanoi(disk - 1, aux, des, sou);
    }
}
