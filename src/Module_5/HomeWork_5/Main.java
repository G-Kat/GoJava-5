package Module_5.HomeWork_5;

import java.util.Arrays;

/**
 * Created by guzya on 04.12.2016.
 */
public class Main {


    public static void main(String[] args) {
        Controller check = new Controller();


        System.out.println(Arrays.toString(check.requestRooms(500, 1, "Paris", "George V")));
        System.out.println("============================");
        System.out.println(Arrays.toString(check.requestRooms(200, 2, "Oslo", "Warwick")));
        System.out.println("============================");
        System.out.println(Arrays.toString(check.requestRooms(100, 1, "London", "Windsor")));
        System.out.println("============================");

        System.out.println(Arrays.toString(check.check(new TripAdvisorAPI(), new GoogleAPI(), 500, 1, "Paris", "George V")));
        System.out.println("============================");
        System.out.println(Arrays.toString(check.check(new GoogleAPI(), new BookingComAPI(), 100, 1, "London", "Windsor")));
        System.out.println("============================");
        System.out.println(Arrays.toString(check.check(new BookingComAPI(), new TripAdvisorAPI(), 100, 3, "London", "Ritz")));
        System.out.println("============================");
    }
}
