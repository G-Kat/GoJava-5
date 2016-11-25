package Module_4.HomeWork_4;

import static Module_4.HomeWork_4.Currency.EUR;
import static Module_4.HomeWork_4.Currency.USD;

/**
 * Created by guzya on 20.11.2016.
 */
public class USBank extends Bank {
    public USBank(long id, String bankCountry, Module_4.HomeWork_4.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == USD) {
            return 1000;}
         else
        {return 1200;}
        }


    @Override
    int getLimitOfFunding() {
        if (getCurrency() == USD) {
            return Integer.MAX_VALUE;
        } else {
            return 10000;
        }
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == USD) {
            return 1/100;
        } else  {
            return 2/100;
        }
            }

    @Override
    int getCommission(int summ) {
        if (getCurrency() == USD && summ<=1000) {
            return (int) (summ*0.05);
        } else if (getCurrency() == USD && summ>1000) {
            return (int) (summ*0.07);
        }else if (getCurrency() == EUR && summ<=1000) {
            return (int) (summ*0.06);
        }else {
            return (int) (summ*0.08);
        }
          }

    @Override
    public String toString() {
        return "USBank";
    }
}
//TASK 3
//        USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
//        limit of funding - 10000 if EUR and no limit if USD
//        monthly rate - 1% with USD and 2% with EUR
//        commision - 5% if USD and up to 1000, 7% if USD and more than 1000
//        6% if EUR and up to 1000 and 8% if EUR and more than 1000