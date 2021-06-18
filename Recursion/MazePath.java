import java.util.*;
public class MazePath {
    public static void main(String[] args){

        int paths = totalPaths(4,3);
        System.out.println(paths);

        ArrayList<String> totalpaths = getMazePath(3,3);
        System.out.println(totalpaths);

        ArrayList<String> pathFromIndex = getMazePath(3, 3, 1, 1);
        System.out.println(pathFromIndex);

        printMazePath(3, 3, 1, 1, "");
    }

    // total number of paths a maze of m x n can have.
    private static int totalPaths(int m, int n){
        if(m == 1 || n == 1)
            return 1;

        return totalPaths(m-1, n) + totalPaths(m, n-1);
    }

    // In this inital position is (1,1)
    private static ArrayList<String> getMazePath(int m, int n){
        if(m == 1){
            ArrayList<String> str = new ArrayList<String>();
            String s = "";
            for(int i = 0; i < n - 1; i++)
                s = s + "d";
            str.add(s);
            return str;
        }
        else if(n == 1){
            ArrayList<String> str = new ArrayList<String>();
            String s = "";
            for(int i = 0; i < m - 1; i++)
                s = s + "f";
            str.add(s);
            return str;
        }
        
        ArrayList<String> downward = getMazePath(m, n-1);
        ArrayList<String> forward = getMazePath(m-1, n);

        ArrayList<String> paths = new ArrayList<String>();

        for(String path: forward)
            paths.add("f" + path);

        for(String path: downward)
            paths.add("d" + path);

        return paths;
    }   

    // in this method we provide initial value of x and y
    private static ArrayList<String> getMazePath(int m, int n, int x, int y){
        if(x == m){
            ArrayList<String> str = new ArrayList<String>();
            String s = "";
            for(int i = y; i < n; i++)
                s = s + "d";
            str.add(s);
            return str;
        }
        else if(y == n){
            ArrayList<String> str = new ArrayList<String>();
            String s = "";
            for(int i = x; i < m; i++)
                s = s + "f";
            str.add(s);
            return str;
        }
        
        ArrayList<String> downward = getMazePath(m, n, x+1, y);
        ArrayList<String> forward = getMazePath(m, n, x , y+1);

        ArrayList<String> paths = new ArrayList<String>();

        for(String path: forward)
            paths.add("d" + path);

        for(String path: downward)
            paths.add("f" + path);

        return paths;
    }  

    // print maze path directly
    private static void printMazePath(int m, int n, int x, int y, String ans){
        if(x == m && y == n){
            System.out.print(ans + " ");
            return;
        }
        else if(x > m || y > n)
            return;

        printMazePath(m, n, x + 1, y, "d" + ans);
        printMazePath(m, n, x, y + 1, "f" + ans);
    }
}
