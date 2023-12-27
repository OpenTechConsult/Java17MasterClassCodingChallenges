public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600L); // should print "525600 min = 1y and 0d"
        printYearsAndDays(1051200L); // should print "1051200 min = 2y and 0d"
        printYearsAndDays(561600L); // should print "561600 min = 1y and 25d"
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (minutes < 1440L) {
            System.out.println(minutes + " min = 0 y and 0 d");
        } else {
            long numberOfDays = minutes / 1440L;

            if (numberOfDays < 365L) {
                System.out.println(minutes + " min = 0 y and " + numberOfDays + " d");
            } else {
                long numberOfYears = numberOfDays / 365L;
                long remainingDays = numberOfDays % 365L;
                System.out.println(minutes + " min = " + numberOfYears +" y and " + remainingDays + " d");
            }
        }

    }
}
