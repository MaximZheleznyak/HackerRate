

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            Test3 test3 = new Test3();

            for (int i = 1; i <= 10; i++) {
                int result = test3.multiPly(i, n);
                System.out.println(n +" x "+ i + " = " + result);
            }

            bufferedReader.close();
        }

        public int multiPly (int a, int b){
            return a * b;
        }

    }

