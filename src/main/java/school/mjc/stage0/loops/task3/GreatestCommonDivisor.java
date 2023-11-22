package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int dividend;
        int divisor;
        int reminder;

        if (first >= second) {
            dividend = first;
            divisor = second;
        } else {
            dividend = second;
            divisor = first;
        }

        if (divisor == 0) System.out.println(dividend);
        else {
            reminder = dividend % divisor;
            while (reminder != 0) {
                dividend = divisor;
                divisor = reminder;
                reminder = dividend % divisor;
            }
            System.out.println(divisor);
        }
    }
}
