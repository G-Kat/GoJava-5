package Module_5.HomeWork_5;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by guzya on 26.11.2016.
 */
public class GoogleAPI implements API {
    Room[] rooms = new Room[5];

    public GoogleAPI() {
        this.rooms[0] = new Room(10L, 100, 2, new Date(123548679412L), "RadissonBlu", "Kyiv");
        this.rooms[1] = new Room(16L, 200, 2, new Date(1234484312L), "Warwick", "Oslo");
        this.rooms[2] = new Room(12L, 300, 2, new Date(32464321548L), "Kavalier", "Lviv");
        this.rooms[3] = new Room(13L, 100, 1, new Date(123548679412L), "Windsor", "London");
        this.rooms[4] = new Room(19L, 500, 1, new Date(254941324587L), "George V", "Paris");
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
