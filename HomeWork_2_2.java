package Module_2;

/**
 * Created by guzya on 06.11.2016.
 */
public class HomeWork_2_2 {
    static void atm (int balance, int withdrawal){
        double commission = withdrawal*0.05;
        double newBalance = balance-withdrawal-commission;

        if(newBalance>=0){
            System.out.println("OK " + commission + " " + newBalance);
        }
        else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 15;
        atm(balance, withdrawal);
    }

}

    /* Continue with BANK example
2.1 Write method which withdraws money from account and takes commision 5% of the transaction. Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.

        Example

        Input

        balance = 100
        withdrawal = 10

        Output
        OK 0.5 89.5

        Input

        balance = 100
        withdrawal = 99

        Output
        NO */

