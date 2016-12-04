package Module_5.HomeWork_5;

/**
 * Created by guzya on 26.11.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
}

//        TASK  3

//        Create API interface which contains one method
//        Room[] findRooms(int price, int persons, String city, String hotel)
//
//        TASK 4
//
//        Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI.
// Every implementation has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.