package Module_1;

import java.util.Arrays;

public class HomeWork_2_1 {
    static int sum(int[] array) {
        int sum=0;
        for(int i=0; i<array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println("SUM int: " + sum);
            return sum;
    }
    static double sum(double[] array1) {
        double sum=0;
        for(int i=0; i<array1.length; i++) {
            sum=sum+array1[i];
        }
        System.out.println("SUM double " + sum);
        return sum;
    }
    static int min(int array[]) {
        int min = array [0];
        for(int i=0; i<array.length; i++) {
            if( array[i]< min) {
                min = array[i];
            }
        }
        System.out.println("MIN int: " + min);
        return min;
    }
    static double min(double array1[]) {
        double min = array1 [0];
        for(int i=0; i<array1.length; i++) {
            if( array1[i]< min) {
                min = array1[i];
            }
        }
        System.out.println("MIN double: " + min);
        return min;
    }
    static int max(int array[]) {
        int max = array [0];
        for(int i=0; i<array.length; i++) {
            if( array[i]> max) {
                max = array[i];
            }
        }
        System.out.println("MAX int: " + max);
        return max;
    }
    static double max(double array1[]) {
        double max = array1 [0];
        for(int i=0; i<array1.length; i++) {
            if( array1[i]> max) {
                max = array1[i];
            }
        }
        System.out.println("MAX double: " + max);
        return max;
    }
    static int maxPositive(int array[]) {
        Arrays.sort(array);
            if (array[9] > 0) {
                System.out.println("maxPositive int : " + array[9]);
            } else {
                System.out.println("maxPositive int - no answer.");
            }
        return array[9];
    }
    static double maxPositive(double array1[]) {
        double maxPositive= 0;
        Arrays.sort(array1);
            if (array1[9] > 0) {
                System.out.println("maxPositive double: " + array1[9]);
            } else {
                System.out.println("maxPositive double - no answer.");
            }
        return array1[9];
    }
    static int multiplication(int array[]) {
        int mult = 1;
        for(int i=0;i<array.length;i++) {
            mult=mult*array[i];
        }
        System.out.println("multiplication int : " + mult);
        return mult;
    }
    static double multiplication(double array1[]) {
        double mult = 1.0;
        for(int i=0;i<array1.length;i++) {
            mult=mult*array1[i];
        }
        System.out.println("multiplication double : " + mult);
        return mult;
    }
    static int modulus (int  array[]) {
        int a = array[0];
        int b = array[array.length-1];
        System.out.println("Modulus int: " + a%b);
        return a%b;
    }

    static double modulus (double  array1[]) {
        System.out.println("Modulus double: " + array1[0]%array1[array1.length-1]);
        return array1[0]%array1[array1.length-1];
    }
    static int secondLargest (int array[]){
        Arrays.sort(array);
        System.out.println("SecondLargest int : " + array[array.length-2]);
                return array[array.length-2];
    }
    static void secondLargest (double array1[]){
        double largest = array1[0];
        for(int i=0; i<array1.length; i++)
            if (array1[i] > largest) {
                largest = array1[i];
            }
        double secondLargest = array1[array1.length-2];
        System.out.println("SecondLargest double : " + secondLargest);
    }
    public static void main(String[] args) {
        int[] array = {-10,-2,-3,-4,0,1,2,3,4,8};
        double[] array1 = {-0.12,0.11,0.1,0.1,0.1,0.1111,0.1,0.1,0.1,0.12};

        sum(array);
        sum(array1);
        min(array);
        min(array1);
        max(array);
        max(array1);
        maxPositive(array);
        maxPositive(array1);
        multiplication(array);
        multiplication(array1);
        modulus(array);
        modulus(array1);
        secondLargest(array);
        secondLargest(array1);

    }

}




  /*  Input: array with size = 10 can be of one of two data types: int and double. Calculate:

    sum
    min/max
    max positive
    multiplication
    modulus of first and last element
    second largest element

    As a result you should have methods with following names :

    sum(int array[]), sum(double[])
    min(int array[]), min(double[])
    max(int array[]), max(double[])
    maxPositive(int array[]), maxPositive(double array[]),
    multiplication  (int array[]), multiplication (double[])
    modulus(int array[]), modulus(double[])
    secondLargest(int array[]), secondLargest(double[]) */


