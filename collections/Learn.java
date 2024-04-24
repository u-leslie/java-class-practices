package collections;
import java.util.*;

//collection learn start

// public class Learn {
//     public static void main(String[] args) {
//         Collection value = new ArrayList();
//         value.add(3);
//         value.add(4);

//         for (Object obj:value){
//             int n =(Integer)obj;
//             System.out.println(n);
//         }
//     }
// }

//generics 

public class Learn {
    public static void main(String[] args) {
     List <String> list = new ArrayList();
     list.add("abc");
     for(Object str:list){
        System.out.println(str);
     }
    }
}