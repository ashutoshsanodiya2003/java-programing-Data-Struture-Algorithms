package ifElse;

import java.util.Scanner;

public class Q_4WeeklyNameProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String dayName = "";

        if (n == 1)
            dayName = "Monday";
        else if (n == 2)
            dayName = "Tuesday";
        else if (n == 3)
            dayName = "Wednesday";
        else if (n == 4)
            dayName = "Thursday";
        else if (n == 5)
            dayName = "Friday";
        else if (n == 6)
            dayName = "Saturday";
        else if (n == 7)
            dayName = "Sunday";
        else
            dayName = "invalid Number";

        System.out.println(dayName);

    }
}
