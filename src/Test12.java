import java.util.*;

public class Test12 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        System.out.println(first.length() + second.length());

        Set <String> set = new TreeSet();

        set.add(first);
        set.add(second);

        List <String> list = new ArrayList<>();


        for (String s:
              set) {
            list.add(s);
        }

if (first.equals(list.get(0))){
    System.out.println("Yes");

} else {
    System.out.println("no");

}




    }
}
