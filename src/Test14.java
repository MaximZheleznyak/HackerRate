import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int x  = scanner.nextInt();
        Test14 test = new Test14();
        test.getSmallestAndLargest(line, x);
    }


    public String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        List <String> list = new ArrayList();

        for(int i=0;i<s.length()-k+1;i++){
            list.add(s.substring(i,i+k));
        }

        java.util.Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size()-1);


        return smallest + "\n" + largest;
    }
}
