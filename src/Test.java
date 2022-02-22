import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();
            double d = scan.nextDouble();
            scan.skip(scan.nextLine());
            String s = scan.nextLine();

            System.out.println("String: " + a);
            System.out.println("String: " + d);
            System.out.println("String: " + s);



        }
    }







