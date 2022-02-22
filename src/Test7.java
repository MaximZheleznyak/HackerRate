import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//for test file realisation

public class Test7 {

    public static void main(String[] args) throws IOException {

        int stringCounter = 0;

        List<String> stringList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            stringCounter++;
            System.out.println( stringCounter +" "+ scanner.nextLine());
        }

        for (String s : stringList) {
            System.out.print(s);
        }
    }
}
