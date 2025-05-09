public class Reduce {
    public static void main(String[] args) {
        int start = 100;
        int steps = 0;
        while (start > 0) {
            boolean Even = start % 2 == 0;

            if (Even) {
                start = start / 2;
            }
            else {
                start--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
