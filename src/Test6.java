import java.io.*;

import java.util.ArrayList;
import java.util.List;


//for test file realisation

public class Test6 {

    public static void main(String[] args) throws IOException {
        int stringCounter = 0;

        List<String> stringList = new ArrayList<>();

        File file = new File("testFile");

        FileReader fr = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fr);

        while (bufferedReader.ready()){
           StringBuilder stringBuilder = new StringBuilder();
           stringCounter ++;
           stringList.add(String.valueOf(stringBuilder.append(stringCounter).append(" ").append(bufferedReader.readLine())));
           stringList.add("\n");
        }

        for (String s : stringList) {
            System.out.print(s);
        }
    }
}
