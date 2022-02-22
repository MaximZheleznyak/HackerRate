

import java.util.Scanner;

public class Test4 {

    public static int result = 0;
    public  static StringBuilder sb = new StringBuilder();

    public static void main(String []argh){

        Test4 test = new Test4();
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt(); // начало
            int b = in.nextInt(); // множитель
            int n = in.nextInt(); // длина очереди

            for (int j = 0; j < n; j++) {
                a =  a + test.MultiplicatorMethod(b);
                test.arrayCollector(a);
            }
            result = 0;
            sb.append("\n");

        }
        System.out.println(sb.toString());

        in.close();
    }

    public int MultiplicatorMethod (int b){

        if (result == 0){
            result = 1;
            return result *b;

        } else {
            result = result *2;
            return result*b;
        }
    }

    public void arrayCollector (int a){
        sb.append(a + " ");

    }
}
