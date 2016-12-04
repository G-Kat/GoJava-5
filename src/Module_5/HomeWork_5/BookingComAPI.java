package Module_5.HomeWork_5;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by guzya on 26.11.2016.
 */
public class BookingComAPI implements API {
    Room[] rooms = new Room[5];

    public BookingComAPI() {
        this.rooms[0] = new Room(20L, 100, 1, new Date(123548679412L), "Windsor", "London");
        this.rooms[1] = new Room(21L, 200, 2, new Date(1234484312L), "Grand Hotel", "Oslo");
        this.rooms[2] = new Room(22L, 100, 3, new Date(123548679412L), "Ritz", "London");
        this.rooms[3] = new Room(23L, 400, 2, new Date(2358794548L), "Le Bristol", "Paris");
        this.rooms[4] = new Room(24L, 500, 3, new Date(254941324587L), "Paris France Hotel", "Paris");
    }

    public Room[] getRooms() {
        return rooms;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] sortedRooms = new Room[0];
        for (int i = 0; i < getRooms().length; i++) {
            if (getRooms()[i].getPrice() == price && getRooms()[i].getPersons() == persons && getRooms()[i].getCityName().equals(city) && getRooms()[i].getHotelName().equals(hotel)) {
                sortedRooms = Arrays.copyOf(sortedRooms, sortedRooms.length + 1);
                sortedRooms[sortedRooms.length - 1] = rooms[i];
            }
        }
        return sortedRooms;
    }

}
