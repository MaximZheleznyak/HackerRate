import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Test13 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int start = scanner.nextInt();
        int stop = scanner.nextInt();

        byte [] byteArray = s.getBytes(StandardCharsets.UTF_8);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = start; i < stop; i++) {
            stringBuilder.append(byteArray[i]);
        }

        for (Byte b: byteArray
             ) {
            System.out.println(b);
        }




    }


}
