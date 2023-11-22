package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0;
        int num2 = 1;
        int temp;
        if (lastFibonacci >= 0) System.out.println(0);
        if (lastFibonacci >= 1) System.out.println(1);
        for (int count = 2; count < lastFibonacci; count++) {
            temp = num2;
            num2 += num1;
            num1 = temp;
            System.out.println(num2);
        }
    }
}
