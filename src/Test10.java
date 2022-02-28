
import java.util.*;



class Test10 {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    Scanner scanner = new Scanner(System.in);

    int month= scanner.nextInt();
    int day = scanner.nextInt();
    int year = scanner.nextInt();


    public static void main(String[] args) {
        Test10 test = new Test10();
        System.out.println(findDay(test.year, test.month, test.day));
    }


    public static String findDay(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month-1, day);

            int dayNum = calendar.get(Calendar.DAY_OF_WEEK);

            if (dayNum == 1) {
                return "SUNDAY";
            } else if (dayNum == 2) {
                return "MONDAY";

            } else if (dayNum == 3) {
                return "TUESDAY";

            } else if (dayNum == 4) {
                return "WEDNESDAY";

            } else if (dayNum == 5) {
                return "THURSDAY";

            } else if (dayNum == 6) {
                return "FRIDAY";

            } else
                return "SATURDAY";
        }
    }