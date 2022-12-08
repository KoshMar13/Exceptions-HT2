package HT.HT2;

/**
 * Если необходимо, исправьте данный код:
 * try {
 * int d = 0;
 * double catchedRes1 = intArray[8] / d;
 * System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 * System.out.println("Catching exception: " + e);
 * }
 */

public class Task2 {
    public static void main(String[] args) {
        int d = 1;
        int[] intArray = new int[8];
        double[] ansArray = new double[8];
        for (int i = 0; i < ansArray.length; i++) {
            try {
                ansArray[i] = intArray[i] / d;
                System.out.println("catchedRes1 = " + ansArray[i]);
            } catch (Exception e) {
                System.out.println("Catching exception: " + e.getClass().getSimpleName());
            }
        }

    }
}