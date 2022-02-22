import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test5{
    static List<String> stringArray = new ArrayList<>();


    Integer x = 5;

    public static void main (String... argh)
    {
        Test5 test = new Test5();
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        sc.skip(sc.nextLine());

        for(int i=0;i<t;i++)
        {
            String s = sc.nextLine();
            stringArray.add(s);
        }

        for (int i = 0; i < stringArray.size(); i++) {
            test.StringDetector(stringArray.get(i));
        }
    }

    public void StringDetector (String str){

        try {
            long x = Long.parseLong(str);

        System.out.println(x+" can be fitted in:");

        if(x>=-128 && x<=127)
        {
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");

        } else if (x>=-32768 && x <= 32767)

        {   System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");

        } else if (x>=Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
        {   System.out.println("* int");
            System.out.println("* long");

        } else if (x>=Long.MIN_VALUE && x <= Long.MAX_VALUE)
        {
            System.out.println("* long");
        }
        }
        catch (Exception e){
            System.out.println(str+" can't be fitted anywhere.");
            return;
        }
    }
}