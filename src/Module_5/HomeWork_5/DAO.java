package Module_5.HomeWork_5;

/**
 * Created by guzya on 04.12.2016.
 */
public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

}
