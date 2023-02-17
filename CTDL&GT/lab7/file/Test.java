import java.io.*;
import java.util.*;

public class Test {
    // public static <E> void writeFile(String path, Object object) {
    // try {
    // FileWriter writer = new FileWriter(path);

    // writer.write(String.valueOf(object));
    // writer.close();

    // System.out.println("Successfully wrote to the file.");
    // } catch (IOException e) {
    // System.out.println("Error.");
    // }
    // }

    public static <E> void readFile(String path, MyAVL a) {
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] str = data.split(" ");
                for (String i : str) {
                    a.insert(Integer.parseInt(i));
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public <E> void writeFile(Integer object) {
        try {
            PrintWriter writer = new PrintWriter("output.txt");

            writer.write(String.valueOf(object) + " ");
            writer.close();
            // System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }

    public static void main(String[] args) {
        MyAVL a = new MyAVL();
        readFile("input.txt", a);
        try {
            PrintWriter writer = new PrintWriter("output.txt");
            writer.print("NLR: ");
            a.NLR(a.root, writer);
            writer.println();
            writer.print("LNR: ");
            a.LNR(a.root, writer);
            writer.println();
            writer.print("LRN: ");
            a.LRN(a.root, writer);
            writer.close();
            // System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
        }

    }

}
