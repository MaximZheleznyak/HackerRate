import java.util.Scanner;

public class Test15 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder = stringBuilder.append(s);
        stringBuilder.reverse();

        if (s.equals(stringBuilder.toString())){
            System.out.println("Yes");

        } else  {
            System.out.println("No");
        }

    }
}
