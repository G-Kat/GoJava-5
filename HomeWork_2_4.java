package Module_2;

/**
 * Created by guzya on 06.11.2016.
 */
public class HomeWork_2_4 {
    static void atm(int[] balances, String[] ownerNames, double withdrawal) {

        for (int i = 0; i < balances.length; i++) {
            double newBalance = balances[i] + withdrawal;
            String name = ownerNames[i];
            System.out.println(name + " " + newBalance);
        }
    }

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double withdrawal = 100;


        atm(balances, ownerNames, withdrawal);
    }
}
   /* Домашнее задание №2.4
        Grade: N/A
        View Grade Information. Opens a dialogue
        You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding

        Input

        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = Oww
        double withdrawal = 100;

        Output
        Oww 600
        */