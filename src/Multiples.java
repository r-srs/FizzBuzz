public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int totMultiple = 0;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3) {
                totMultiple++;
            }
            else if (divisibleBy5) {
                totMultiple++;
            }

            i++;
        }
        System.out.println(totMultiple);
    }
}
