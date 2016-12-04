package Module_5.HomeWork_5;

import java.util.Arrays;

/**
 * Created by guzya on 04.12.2016.
 */
public class Controller {
    private API apis[] = new API[3];

    public Controller() {
        this.apis[0] = new TripAdvisorAPI();
        this.apis[1] = new GoogleAPI();
        this.apis[2] = new BookingComAPI();
    }

    public API[] getApis() {
        return apis;
    }


    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] requestedRooms = new Room[0];
        for (int i = 0; i < apis.length; i++) {
            if (apis[i].findRooms(price, persons, city, hotel).length > 0) {
                for (int j = 0; j < apis[i].findRooms(price, persons, city, hotel).length; j++) {
                    if (apis[i].findRooms(price, persons, city, hotel)[j].getPrice() == price &&
                            apis[i].findRooms(price, persons, city, hotel)[j].getPersons() == persons &&
                            apis[i].findRooms(price, persons, city, hotel)[j].getCityName().equals(city) &&
                            apis[i].findRooms(price, persons, city, hotel)[j].getHotelName().equals(hotel)) {
                        requestedRooms = Arrays.copyOf(requestedRooms, requestedRooms.length + 1);
                        requestedRooms[requestedRooms.length - 1] = apis[i].findRooms(price, persons, city, hotel)[j];
                    }
                }
            }

        }
        return requestedRooms;
    }

    //    which finds all the rooms with requested params. Method use all apis available to make search.
//    Found rooms create to DB


    Room[] check(API api1, API api2, int price, int persons, String city, String hotel) {
        //были добавлены параметры int price, int persons, String city, String hotel, иначе непонятно как делать сравнение.
        Room[] checkedRooms = new Room[0];
        if (api1.findRooms(price, persons, city, hotel).length > 0) {
            for (int i = 0; i < api1.findRooms(price, persons, city, hotel).length; i++) {
                if (api2.findRooms(price, persons, city, hotel).length > 0) {
                    for (int j = 0; j < api2.findRooms(price, persons, city, hotel).length; j++) {
                        if (api1.findRooms(price, persons, city, hotel)[i].equals(api2.findRooms(price, persons, city, hotel)[j])) {
                            int n = 0;
                            checkedRooms = Arrays.copyOf(checkedRooms, checkedRooms.length + 1);
                            checkedRooms[checkedRooms.length - 1] = api1.findRooms(price, persons, city, hotel)[j];
                            n++;
                            System.out.println(api1.getClass().getSimpleName() + "+" + api2.getClass().getSimpleName() + " Комнаты по заданым параметрам совпали " + n + " раз:");
                        }
                    }
                }
            }
        }
        return checkedRooms;
    }
}
