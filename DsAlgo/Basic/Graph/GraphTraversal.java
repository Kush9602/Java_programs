import java.util.*;
public class GraphTraversal {

    private LinkedList<Integer>[] adjList;
    int vertices;

    public GraphTraversal(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for(int i = 0; i < vertices; i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }

    // add edges in a graph
    public void addEdges(int source, int destination){
        adjList[source].add(destination);
        adjList[destination].add(source);
    }


    public void bfs(int source){
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[vertices];

        // started from source
        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.print(curr + " ");

            for(int neighbor: adjList[curr]){
                if(!visited[neighbor]){
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
                    
            }
        }
    }

    // finding shortest path using bfs
    public int shortestPath(int source, int destination){
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[vertices];
        int parent[] = new int[vertices];

        queue.add(source);
        visited[source] = true;
        parent[source] = -1;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            if(curr == destination)
                break;

            for(int neighbor: adjList[curr]){
                if(!visited[neighbor]){
                    queue.add(neighbor);
                    visited[neighbor] = true;
                    parent[neighbor] = curr;
                }
            }
        }
        int dis = 0;
        int curr = destination;
        while(parent[curr] != -1){
            System.out.print(curr + " --> ");
            curr = parent[curr];  
            dis++;
        }
        System.out.print(curr);

        return dis;
    }


    public void dfs(int source){

    }


    public void printList() {
        for(int i = 0; i < vertices; i++)
            System.out.println(adjList[i]);
    }

    public static void main(String[] args){
        GraphTraversal graph = new GraphTraversal(5);

        graph.addEdges(0,1);
        graph.addEdges(0,4);
        graph.addEdges(1,2);
        graph.addEdges(2,3);
        graph.addEdges(3,4);
        graph.addEdges(4,2);

        
        graph.shortestPath(3,0);
    }
}