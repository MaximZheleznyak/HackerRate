import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Test19 {

   static List<ArrayList> mainList = new ArrayList<>();

    public static void main(String[] args) {
        Test19 test = new Test19();
        List <String> resultArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < x; i++) {
            String line = scanner.nextLine();
            mainList.add(test.arrayCreator(line));

        }

        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < c; i++) {
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            resultArray.add(test.getNumber(y,z));

        }

        for (String i: resultArray
             ) {
            if (i.equals("-1")){
                System.out.println("ERROR");

            } else {
                System.out.println(i);
            }
        }
    }


    public ArrayList<Integer> arrayCreator(String s) {

        Scanner scanner = new Scanner(s);

        ArrayList <Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()){
            list.add(scanner.nextInt());
                    }
        return list;
    }

    public String getNumber (int a, int b){

        try {

            ArrayList <Integer> list = mainList.get(a-1);
            String x = String.valueOf(list.get(b));
            return x;

        } catch (Exception e){
            return String.valueOf(-1);
        }
    }
}
