package Module_3.HomeWork_3_2;

/**
 * Created by guzya on 12.11.2016.
 */
public class Adder extends Arithmetic {

    public Adder(Integer a, Integer b) {
        super(a, b);
    }

    boolean check() {
        if (a >= b) {
            return true;
        } else return false;
    }


}
