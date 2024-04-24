
import java.io.*;

public class stream {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/home/leslie/Documents/source.txt");
            out = new FileOutputStream("/home/leslie/Documents/destination.txt");   
            
            int content;
            while ((content = in.read()) != -1) {
                out.write((char)content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


// package exercises;

// import java.io.*;

// public class StreamMain {
//     public static void main(String[] args) {
//         FileInputStream in = null;
//         FileOutputStream out = null;

//         try {
//             in = new FileInputStream("D:\\UMUTONI\\Java\\exercises\\source.txt");
//             out = new FileOutputStream("D:\\UMUTONI\\Java\\exercises\\output.txt");
//             int content;

//             while ((content = in.read()) != -1){
//                 out.write((byte) content);
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         } 
//     }
// }