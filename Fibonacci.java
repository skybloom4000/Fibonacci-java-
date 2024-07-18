public class Fibonacci {

    // Method to calculate Fibonacci sequence up to a limit and sum of even values
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int first = 1;
        int second = 2;
        int next = first + second;

        while (next <= limit) {
            if (next % 2 == 0) {
                sum += next;
            }
            first = second;
            second = next;
            next = first + second;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Find sum of even Fibonacci terms below four million
        int limit = 4000000;
        int sum = sumEvenFibonacci(limit);
        System.out.println("Sum of even Fibonacci terms below " + limit + " is: " + sum);
    }
}
