// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.PrintWriter;

// public class BufferMain {
//     public static void main(String[] args) {
//         BufferedReader reader = null;
//         PrintWriter writer = null;

//         try {
//             reader = new BufferedReader(new FileReader("/home/leslie/Documents/source.txt"));
//             writer = new PrintWriter(new FileWriter("/home/leslie/Documents/dest.txt"));

//             String line;
//             while ((line = reader.readLine()) != null) {
//                 writer.println(line);
//             }
//         } catch (IOException e) {
//             System.out.println(e);
//         } finally {
//             try {
//                 if (reader != null) {
//                     reader.close();
//                 }
//                 if (writer != null) {
//                     writer.close();
//                 }
//             } catch (IOException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferMain {
    public static void main(String[] args) {
        // try (Scanner scanner = new Scanner(new File("/home/leslie/Documents/source.txt"));
        //      PrintWriter writer = new PrintWriter(new FileWriter("/home/leslie/Documents/dest.txt"))) {

        //     while (scanner.hasNextLine()) {
        //         String line = scanner.nextLine();

        //         writer.println(line);
        //         System.out.println(line);
        //     }

        //     System.out.println("Content has been read and written ");

        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        //formatting in java

        //float->%f
        //string->%f
        //boolean->%b
        //new line -> /n


        System.out.printf("%S", "Hello");
        
    }
}