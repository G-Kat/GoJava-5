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