package Module_4.HomeWork_4;

/**
 * Created by guzya on 20.11.2016.
 */
public interface BankSystem {
    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}

//TASK 5
//
//        Create interface BankSystem with methods:
//
//        void withdrawOfUser(User user, int amount)
//        void fundUser(User user, int amount)
//        void transferMoney(User fromUser, User toUser, int amount)
//        void paySalary(User user)
//
//        And its implementation BankSystemImpl.