package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("args-size= " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }

    }

    /**
     *
     * @param a - is an integer type
     * @param b - is an inter type too
     * @return returns the sum of integers
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
