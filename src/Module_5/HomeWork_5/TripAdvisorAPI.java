package Module_5.HomeWork_5;


import java.util.Arrays;
import java.util.Date;

/**
 * Created by guzya on 26.11.2016.
 */
public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        this.rooms[0] = new Room(15L, 100, 3, new Date(123548679412L), "Ritz", "London");
        this.rooms[1] = new Room(16L, 200, 2, new Date(1234484312L), "Warwick", "Oslo");
        this.rooms[2] = new Room(17L, 300, 1, new Date(32464321548L), "Barcelo", "Casablanca");
        this.rooms[3] = new Room(18L, 400, 3, new Date(2358794548L), "Sangri La Hotel", "Paris");
        this.rooms[4] = new Room(19L, 500, 1, new Date(254941324587L), "George V", "Paris");
    }

    public Room[] getRooms() {
        return rooms;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] sortedRooms = new Room[0];
        for (int i = 0; i < getRooms().length; i++) {
            if (getRooms()[i].getPrice() == price && getRooms()[i].getPersons() == persons && getRooms()[i].getCityName().equals(city) && getRooms()[i].getHotelName().equals(hotel)) {
                sortedRooms = Arrays.copyOf(sortedRooms, sortedRooms.length + 1);
                sortedRooms[sortedRooms.length - 1] = rooms[i];
            }
            // прописать метод для создания нового массива объектов, подходящего под данный критерий.
        }
        return sortedRooms;
    }

}
