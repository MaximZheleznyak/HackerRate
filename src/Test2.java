

import java.util.Scanner;

public class Test2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stringsArray = new String[3];

        System.out.println("================================");

        for(int i=0;i<3;i++) {
            String string = sc.next();
            int x = sc.nextInt();
            Test2 test2 = new Test2();
            stringsArray[i] = test2.stringFormatter (string, x);
         }

        for (String s: stringsArray
             ) {
            System.out.println(s);
        }

        System.out.println("================================");
    }


    public String stringFormatter(String s, int x){

        int  spacesSize = 15;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);

        for (int i = 0; i < (spacesSize - s.length()); i++) {
          stringBuilder.append(" ");
        }

        if (x < 10){
            stringBuilder.append("00").append(x);
        } else if (x < 100){
            stringBuilder.append("0").append(x);
        } else {
            stringBuilder.append(x);
        }

        return stringBuilder.toString();
     }
}
