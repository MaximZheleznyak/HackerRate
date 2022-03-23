import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Test18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] stringArray = s.split("[^A-Za-z]");

        List <String> list = new ArrayList<>();

        for (String str : stringArray
        ) {
            if (!Objects.equals(str, "")) {
               list.add(str);
            }
        }

        System.out.println(list.size());

        for (String sline: list
             ) {
            System.out.println(sline);
        }
        scan.close();
    }
}

