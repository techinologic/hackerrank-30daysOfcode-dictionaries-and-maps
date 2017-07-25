//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, String.valueOf(phone));
        }

        while(in.hasNext()){
            String s = in.nextLine();
            if (s.equals("harry")) {
                break;
            }
            // Write code here
            System.out.println(map.keySet());
        }
        in.close();
    }
}
