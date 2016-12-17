package Module_6.Home_Work_6;

import java.util.Arrays;

/**
 * Created by guzya on 17.12.2016.
 */
public class Main {


    public static void main(String[] args) {
        User user1=new User(1, "John", "Smith", 10000, 100000);
        User user2 = new User (2, "Jane", "Smith", 5000, 50000);
        User user3 =new User (1, "John", "Smith", 10000, 100000);

        User[] users = {user1,user2,user3, null};


        System.out.println("Initial list of users: "+ Arrays.toString(users));
        System.out.println();
        System.out.println("List of users with conditional balance: " + Arrays.toString(UserUtils.usersWithContitionalBalance(users, 100000)));
        System.out.println();
        System.out.println("List of users after payment: " + Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println();
        System.out.println("List of user IDs: " + Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println();
        System.out.println("List of unique users:" + Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println();
        System.out.println("List of users after deletion of nulls: " + Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
