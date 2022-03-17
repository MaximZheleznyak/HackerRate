import java.util.*;

public class Test17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        char [] arrayFirst = first.toLowerCase(Locale.ROOT).toCharArray();
        char [] arraySecond = second.toLowerCase(Locale.ROOT).toCharArray();

        List <Character> list = new ArrayList<>();
        List <Character> list2 = new ArrayList<>();


        for (char c : arrayFirst) {
            list.add(c);
        }

        for (char c : arraySecond) {
            list2.add(c);
        }

        Map <Character, Integer> map = new TreeMap<>();
        Map <Character, Integer> map2 = new TreeMap<>();

        for (char b:list
             ) {
           map.put(b,Collections.frequency(list,b));
        }

        for (char b:list2
        ) {
            map2.put(b,Collections.frequency(list2,b));
        }


//        for (Map.Entry <Character, Integer> e: map.entrySet()
//             ) {
//            System.out.println(e);
//        }
//
//        for (Map.Entry <Character, Integer> e: map2.entrySet()
//        ) {
//            System.out.println(e);
//        }

        System.out.println(map.equals(map2));

    }
}
