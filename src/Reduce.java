public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int stepsTaken = 0;
        while (n > 0) {
            boolean divisibleBy2 = n % 2 == 0;

            if (divisibleBy2) {
                n = n / 2;
            }
            else {
                n = n - 1;
            }
            stepsTaken++;
        }
        System.out.println(stepsTaken);
    }
}
