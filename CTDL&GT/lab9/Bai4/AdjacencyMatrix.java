import java.util.*;
import java.io.*;
public class AdjacencyMatrix
{
    private int[][] adj;
    private int edges=0;
    private final int NUMBER_OF_VERTICES;
    public AdjacencyMatrix(int vertices)
    {
        NUMBER_OF_VERTICES = vertices;
        adj = new int[NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
    }
    public void setEgde(int vertexSource , int vertexDestination ,int weight)
    {
        try 
        {
            adj[vertexSource][vertexDestination] = weight;
            adj[vertexDestination][vertexSource] = weight;
            if(weight !=0)
                edges++;
        } 
        catch (ArrayIndexOutOfBoundsException indexBounce)
        {
            System.out.println("The vertex is invalid");
        }
    }
    public int getEgde(int vertexSource , int vertexDestination)
    {
        try
        {
            return adj[vertexSource][vertexDestination];
        } 
        catch (ArrayIndexOutOfBoundsException indexBounce)
        {
            System.out.println("The vertex is invalid");
        }
        return -1;
    }
    public void printGraph()
    {
        for(int i = 0; i < NUMBER_OF_VERTICES; i++)
        {
            for(int j = 0;j < NUMBER_OF_VERTICES; j++)
            {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int countEdge()
    {
        return edges/2;
    }
    public void BFS(int s)
    {
        boolean visited[] = new boolean[NUMBER_OF_VERTICES];
        Queue <Integer > queue = new LinkedList <Integer >();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty())
        {
            int x = queue.poll();
            System.out.print(x + " ");
            for(int i = 0; i < NUMBER_OF_VERTICES; i++)
            {
                if(adj[x][i] != 0 && visited[i] == false)
                {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public void DFS_recur(int v, boolean[] visited)
    {
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 0; i < NUMBER_OF_VERTICES; i++)
        {
            if(adj[v][i] != 0 && visited[i] == false)
            {
                DFS_recur(i, visited);
            }
        }
    }
    public void DFS(int s)
    {
        boolean[] visited = new boolean[NUMBER_OF_VERTICES];
        DFS_recur(s, visited);
    }
    public boolean checkExist(int u,int v)
    {
        if (getEgde(u,v)==1)  
            return true;
        else
            return false; 
    }
    public void neighbors(int vertex)
    {
        for(int i = 0; i < NUMBER_OF_VERTICES; i++)
        {
            if(adj[vertex][i] ==1)
                System.out.print("edge["+vertex+","+i+"], ");
        }
    }
    public static void main(String[] agrs)
    {
        try
        {
            File f = new File("input1.txt");
            FileReader fr = new FileReader(f);
            
            BufferedReader br = new BufferedReader(fr);
            int size = Integer.parseInt(br.readLine());
            boolean visited[] = new boolean[size];
            AdjacencyMatrix ad = new AdjacencyMatrix(size);
            String line;
            int i = 0;
            while((line = br.readLine())!=null)
            {
                String[] val = null;
                val = line.split(" ");
                for(int j = 0; j< val.length;j++)
                {
                    ad.setEgde(i,j,Integer.parseInt(val[j]));
                }
                i++;
            }
            fr.close();
            br.close();
            ad.printGraph();
            System.out.print("So dinh la: "+size+" dinh\n");
            System.out.print("So canh la: "+ad.countEdge()+" canh\n");
            System.out.print("Check the existence of edge (0, 2): "+ad.checkExist(0,2)+"\n");
            System.out.print("Enumerate neighbors of a vertex 2: ");
            ad.neighbors(2);
            System.out.print("\nTraverse the graph by using BFS: ");
            ad.BFS(2);
            System.out.print("\nTraverse the graph by using DFS: ");
            ad.DFS(2);
            System.out.print("\nTraverse the graph by using DFS method without recursion: ");
            ad.DFS_recur(2,visited);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}