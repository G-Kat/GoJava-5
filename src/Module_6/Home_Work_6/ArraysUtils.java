package Module_6.Home_Work_6;

        import java.util.Arrays;

/**
 * Created by guzya on 17.12.2016.
 */
public final class ArraysUtils {
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("SUM int: " + sum);
        return sum;
    }

    public static int min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("MIN int: " + min);
        return min;
    }

    public static int max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("MAX int: " + max);
        return max;
    }

    public static int maxPositive(int array[]) {
        Arrays.sort(array);
        if (array[9] > 0) {
            System.out.println("maxPositive int : " + array[9]);
        } else {
            System.out.println("maxPositive int - no answer.");
        }
        return array[9];
    }

    public static int multiplication(int array[]) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }
        System.out.println("multiplication int : " + mult);
        return mult;
    }

    public static int modulus(int array[]) {
        int a = array[0];
        int b = array[array.length - 1];
        System.out.println("Modulus int: " + a % b);
        return a % b;
    }

    public static int secondLargest(int array[]) {
        Arrays.sort(array);
        System.out.println("SecondLargest int : " + array[array.length - 2]);
        return array[array.length - 2];
    }

    public static int[] reverse(int[] array) {
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
        return array;
    }

    public static int[] findEvenElements(int[] array) {
        int[] evens = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens = Arrays.copyOf(evens, evens.length + 1);
                evens[evens.length - 1] = array[i];
            }
        }
        System.out.println("Sorted even elements: " + Arrays.toString(evens));
        return evens;
    }

}
