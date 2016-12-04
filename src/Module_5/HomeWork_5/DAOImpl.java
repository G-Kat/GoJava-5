package Module_5.HomeWork_5;

/**
 * Created by guzya on 04.12.2016.
 */
public class DAOImpl implements DAO {

//    TASK 5
//    Create DAO interface and its implementation. Methods print operation name and object which was used.
//    Room save(Room room)
//    boolean delete(Room room)
//    Room update(Room room)
//    Room findById(long id)
    @Override
    public Room save(Room room) {
        System.out.println("addition of another room to db");
        return room;
    }


    @Override
    public boolean delete(Room room) {
        System.out.println("Deletion of room from db");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room update in db");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room foundRoom = null;
        System.out.println("Finding room in db by ID");
        return foundRoom;
    }
}
