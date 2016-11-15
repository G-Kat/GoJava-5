package Module_3.HomeWork_3_2;

/**
 * Created by guzya on 12.11.2016.
 */
public class Arithmetic {
    Integer a;
    Integer b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

}


//ЗАДАНИЕ 2
//
//        Write class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
//
//        Write class named Adder that inherits from a superclass named Arithmetic. Also class Adder must contain method check that compare two numbers and returns true if a>=b and false in other cases.
//
//        Methods signature:
//        int add(Integer a, Integer b)
//        boolean check(Integer a, Integer b)