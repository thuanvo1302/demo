import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Test {
    public static void readFile(EL adj) {
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] str = data.split(" ");
                adj.addEdge(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EL adj = new EL();
        readFile(adj);
        adj.printGraph();
        System.out.println(adj.countEdges());

        System.out.println(adj.countVertices());
        adj.neighbors(2);
        System.out.println(adj.existence(3, 1));
    }

}
