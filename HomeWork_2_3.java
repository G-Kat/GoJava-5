package Module_2;

/**
 * Created by guzya on 06.11.2016.
 */
public class HomeWork_2_3 {
    static void atm(int[] balances, String[] ownerNames, double withdrawal) {

        for (int i = 0; i < balances.length; i++) {
            double newBalance = balances[i] - withdrawal * 1.05;
            String name = ownerNames[i];
            if (newBalance >= 0) {
                System.out.println(name + " " + withdrawal + " " + newBalance);
            } else {
                System.out.println(name + " NO");
            }
        }
    }

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double withdrawal = 300;

        atm(balances, ownerNames, withdrawal);
    }
}
   /* Домашнее задание №2.3
        Grade: N/A
        View Grade Information. Opens a dialogue
        You need to write method which withdraw money of particular account owner if he/she can. Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case. Commision is 5% for all cases.

        Example

        Input

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = Ann
        double withdrawal = 100;

        Output
        Ann 100 145

        Input

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = Oww
        double withdrawal = 490;

        Output
        Oww NO
   */
