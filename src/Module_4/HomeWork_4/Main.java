package Module_4.HomeWork_4;

import static Module_4.HomeWork_4.Currency.EUR;
import static Module_4.HomeWork_4.Currency.USD;

/**
 * Created by guzya on 20.11.2016.
 */
public class Main {


    public static void main(String[] args) {// make changes to other users;

        User userUS1 = new User(1232136, "Bilbo", 1000.0, 12, "Halflings", 1, new USBank(100L, "Shire", USD, 500, 2000, 100L, 500L));
        User userUS2 = new User(1232154, "Frodo", 128.15, 1, "Halflings", 57000, new USBank(100L, "Shire", EUR, 500, 2000, 100L, 500L));
        User userEU1 = new User(1232456, "Samwise", 150.0, 3, "Halflings", 11500, new EUBank(1000L, "Shire", USD, 300, 20000, 1000L, 5000L));
        User userEU2 = new User(1232457, "Meriadoc", 128.15, 7, "Halflings", 11500, new EUBank(1000L, "Shire", EUR, 300, 20000, 1000L, 5000L));
        User userCh1 = new User(1232458, "Pippin", 10000.0, 1, "Halflings", 11500, new ChinaBank(500L, "Shire", USD, 1000, 500, 25000L, 500L));
        User userCh2 = new User(1232459, "Smeagol", 0.0, 22, "Halflings", 50000, new ChinaBank(500L, "Shire", EUR, 1000, 500, 25000L, 500L));

        BankSystemImpl newImpl = new BankSystemImpl();
        User[] userArray = {userUS1, userUS2, userEU1, userEU2, userCh1, userCh2};

        userMoneyWithdrawal(userArray, newImpl);
        System.out.println("=============================");
        userFunding(userArray, newImpl);
        System.out.println("=============================");
        moneyTransfer(userArray, newImpl);
        System.out.println("=============================");
        salaryPayOut(userArray, newImpl);
    }

    private static void salaryPayOut(User[] userArray, BankSystemImpl newImpl) {
        for(int i=0; i<userArray.length; i++) {
            System.out.println((i + 1) + ". Operation 4 -  Total Salary Pay Out: " + userArray[i].getName());
            newImpl.paySalary(userArray[i]);
            System.out.println(userArray[i].toString());
            System.out.println();
        }
    }

    private static void moneyTransfer(User[] userArray, BankSystemImpl newImpl) {
        System.out.println("1. Operation 3 -  Transfer: " + userArray[0].getName()+ " to "+ userArray[2].getName());
        newImpl.transferMoney(userArray[0], userArray[2], 200);
        System.out.println(userArray[0].toString());
        System.out.println(userArray[2].toString());
        System.out.println();

        System.out.println("2. Operation 3 -  Transfer: " + userArray[1].getName()+ " to "+ userArray[3].getName());
        newImpl.transferMoney(userArray[1], userArray[3], 100);
        System.out.println(userArray[1].toString());
        System.out.println(userArray[3].toString());
        System.out.println();

        System.out.println("3. Operation 3 -  Transfer: " + userArray[2].getName()+ " to "+ userArray[4].getName());
        newImpl.transferMoney(userArray[2], userArray[4], 500);
        System.out.println(userArray[2].toString());
        System.out.println(userArray[4].toString());
        System.out.println();

        System.out.println("4. Operation 3 -  Transfer: " + userArray[3].getName()+ " to "+ userArray[5].getName());
        newImpl.transferMoney(userArray[3], userArray[5], 10);
        System.out.println(userArray[3].toString());
        System.out.println(userArray[5].toString());
        System.out.println();

        System.out.println("5. Operation 3 -  Transfer: " + userArray[4].getName()+ " to "+ userArray[0].getName());
        newImpl.transferMoney(userArray[4], userArray[0], 100);
        System.out.println(userArray[4].toString());
        System.out.println(userArray[0].toString());
        System.out.println();

        System.out.println("6. Operation 3 -  Transfer: " + userArray[5].getName()+ " to "+ userArray[1].getName());
        newImpl.transferMoney(userArray[5], userArray[1], 300);
        System.out.println(userArray[5].toString());
        System.out.println(userArray[1].toString());
        System.out.println();
    }

    private static void userFunding(User[] userArray, BankSystemImpl newImpl) {
        for (int i = 0; i < userArray.length; i++) {
            System.out.println((i + 1) + ". Operation 2 -  Funding: " + userArray[i].getName());
            newImpl.fundUser(userArray[i], 2500);
            System.out.println(userArray[i].toString());
            System.out.println();

        }
    }

    private static void userMoneyWithdrawal(User[] userArray, BankSystemImpl newImpl) {
        for (int i = 0; i < userArray.length; i++) {
            System.out.println((i + 1) + ". Operation 1 -  Money withdrawal: " + userArray[i].getName());
            newImpl.withdrawOfUser(userArray[i], 1100);
            System.out.println(userArray[i].toString());
            System.out.println();
        }


    }
}

//TASK 6

//    Сreate Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank.
// Run four different operations with erery User’s baalance and print its objects to console.