package Module_4.HomeWork_4;

/**
 * Created by guzya on 20.11.2016.
 */
public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBank().getLimitOfWithdrawal() > amount) {
            user.setBalance(user.getBalance() - amount);
        } else {
            System.out.println("Operation cancelled - Requested amount exceeds withdrawal limit (" + user.getBank().getLimitOfWithdrawal()+" " +user.getBank().getCurrency() +")");
            //add balance limit
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (user.getBank().getLimitOfFunding()>amount){
            user.setBalance(user.getBalance()+amount);
        } else {
            System.out.println("Operation cancelled - Funding exceeds funding limit (" +user.getBank().getLimitOfFunding() +" "+ user.getBank().getCurrency()+ ")");
        }
            }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBalance() >= (amount+fromUser.getBank().getCommission(amount))) {
            fromUser.setBalance(fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount));
            toUser.setBalance(toUser.getBalance() + amount);
        } else {
            System.out.println("Operation cancelled - Not enough money for transfer");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary()*user.getMonthsOfEmployment()*(1+user.getBank().getMonthlyRate())); // если допустить, что сотруднику возвращают зарплату за все проработанные месяцы с процентами.
    }
}
