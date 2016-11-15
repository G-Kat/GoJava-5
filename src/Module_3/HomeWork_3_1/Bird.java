package Module_3.HomeWork_3_1;

/**
 * Created by guzya on 12.11.2016.
 */
public class Bird {
    String walking;
    String flying;
    String singing;
    String myself;


    Bird(String walking, String flying, String singing, String myself) {
        this.walking=walking;
        this.flying=flying;
        this.singing=singing;
        this.myself=myself;

    }

     void sing() {
        System.out.println(this.walking);
        System.out.println(this.flying);
        System.out.println(this.singing);
        System.out.println(this.myself);
    }


}


//ЗАДАНИЕ 1
//
//        You must add a sing method to the Bird class, then modify themain method accordingly so that the code prints the following lines:
//
//        I am walking
//        I am flying
//        I am singing
//        I am Bird