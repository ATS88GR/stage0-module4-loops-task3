package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum1 = 0;
        int sum2 = 0;
        if (lengthOfLastNumber >= 0)
            for (int count = 0; count < lengthOfLastNumber; count++) {
                sum1 += 9 * (int) Math.pow(10, count);
                sum2 += sum1;
            }
        System.out.println(sum2);

    }
}
