public class Multiples {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 1000; i++) {

            boolean DivBy3 = i % 3 == 0;
            boolean DivBy5 = i % 5 == 0;

            if (DivBy3 || DivBy5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
