package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String number = t + "";
        int sum = 0;
        int power = number.length() - 1;
        if (t < 0) {
            power--;
            t *= -1;
        }
        for (int count = power; count >= 0; count--)
            sum += (t / (int) Math.pow(10, count)) % 10;
        System.out.println(sum);
    }
}
