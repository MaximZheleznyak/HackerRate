import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.UNICODE_LOCALE_EXTENSION;

public class Test11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat formatter3 = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat formatter4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = formatter.format(payment);
        String china = formatter2.format(payment);
        String india = formatter3.format(payment);
        String france = formatter4.format(payment);
//



//        System.out.println("\u20ac");
//        System.out.println("\u00A5");





        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }





    }

