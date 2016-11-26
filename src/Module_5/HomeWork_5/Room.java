package Module_5.HomeWork_5;

import java.util.Date;

/**
 * Created by guzya on 26.11.2016.
 */
public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return cityName != null ? cityName.equals(room.cityName) : room.cityName == null;

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
// You need to create part of the System that can find hotel rooms for booking and save it to DataBase.
// The architecture is: class Room which represent room entity that is used in system.
// Interface API and three implementations of it. DAO interface with its implementation.
// And finally Controller that will contain all the logic.
// Also create Main class with main method to demonstrate results.
//        Create UML diagrams first, and only after this write code.
//
//
//        TASK 1
//        Class Room should contain fields
//        long id
//        int price
//        int persons
//        Date dateAvailableFrom
//        String hotelName
//        String cityName
//        Generate getters and setters. And create constructor with all fields.
//
//        TASK 2
//        Override equals and hashCode methods. Rooms are equal when price, persons and cityName are equal.