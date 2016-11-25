package Module_4.HomeWork_4;

import static Module_4.HomeWork_4.Currency.EUR;
import static Module_4.HomeWork_4.Currency.USD;

/**
 * Created by guzya on 20.11.2016.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Module_4.HomeWork_4.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == USD) {
            return 100;}
        else
        {return 150;}

    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == USD) {
            return 10000;
        } else {
            return 5000;
        }
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == USD) {
            return 1/100;
        } else  {
            return 0;
        }
    }

    @Override
    int getCommission(int summ) {
        if (getCurrency() == USD && summ<=1000) {
            return (int) (summ*0.03);
        } else if (getCurrency() == USD && summ>1000) {
            return (int) (summ*0.05);
        }else if (getCurrency() == EUR && summ<=1000) {
            return (int) (summ*0.1);
        }else {
            return (int) (summ*0.11);
        }
    }

    @Override
    public String toString() {
        return "ChinaBank";
    }
}

//ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
//        лимит пополнения - 5000, если EUR и 10000, если USD
//        месячная ставка - 1% на USD и 0% на EUR
//        комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
//        10%, если EUR и до 1000 и 11%, если EUR и больше 1000