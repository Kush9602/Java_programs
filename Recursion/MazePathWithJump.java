import java.util.*;
public class MazePathWithJump {
    public static void main(String[] args){
        int m = 3, n = 3;
        
        ArrayList<String> AL = totalPaths(3,3,1,1);
        System.out.println(AL);
    }

    private static ArrayList<String> totalPaths(int m, int n, int x, int y){
        if(x == m && y == n){
            ArrayList<String> str = new ArrayList<String>();
            str.add("");
            return str;
        }

        ArrayList<String> paths = new ArrayList<String>();

        //horizontal move
        for(int move = 1; move <= m - x; move++){
            ArrayList<String> hpaths = totalPaths(m,n,x+move,y);
            for(String hpath: hpaths)
                paths.add("h"+ move + hpath);
        }

        // vertical paths
        for(int move = 1; move <= n - y; move++){
            ArrayList<String> vpaths = totalPaths(m,n,x,y+move);
            for(String vpath: vpaths)
                paths.add("v"+ move + vpath);
        }
        
        // diagonal paths
        for(int move = 1; move <= m - x && move <= n - y; move++){
            ArrayList<String> dpaths = totalPaths(m,n,x+move,y+move);
            for(String dpath: dpaths)
                paths.add("d"+ move + dpath);
        }
        
        return paths;
    }


    private static void printMazePathWithJump(int m, int n, int x, int y, String ans){

        
    }
}
