package Module_6.Home_Work_6;

import java.util.Arrays;

/**
 * Created by guzya on 17.12.2016.
 */
public class UserUtils {

    static User[] uniqueUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            for (int j=i+1; j< users.length; j++){
               if (users[i].equals(users[j])) {
                   users[i]=null;
                   break;
            }}
        }
    return users;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] usersByBalance = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null && users[i].getBalance() == balance) {
                usersByBalance = Arrays.copyOf(usersByBalance, usersByBalance.length + 1);
                usersByBalance[usersByBalance.length - 1] = users[i];
            }
        }
        return usersByBalance;
    }

    static final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());

        }}
        return users;
    }

    static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] !=null)
            usersId[i] = users[i].getId();
        }
        return usersId;
    }

    static User[] deleteEmptyUsers(User[] users) {
        User[] cleanArray = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                cleanArray = Arrays.copyOf(cleanArray, cleanArray.length + 1);
                cleanArray[cleanArray.length - 1] = users[i];
            }
        }
        return cleanArray;
    }


}
//
//TASK 5
//        Create сlass UserUtils with following methods
//        User[] uniqueUsers(User[] users)
// //users are equal when all their field are equal
//        User[] usersWithContitionalBalance(User[] users, int balance)
// //user’s balance == balance
//        User[] paySalaryToUsers(User[] users)
//        long[] getUsersId(User[] users)
//        User[] deleteEmptyUsers(User[] users)
//
//        Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.
