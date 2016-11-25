package Module_4.HomeWork_4;

import static Module_4.HomeWork_4.Currency.EUR;
import static Module_4.HomeWork_4.Currency.USD;

/**
 * Created by guzya on 20.11.2016.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Module_4.HomeWork_4.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == USD) {
            return 2000;
        } else {
            return 2200;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == USD) {
            return 10000;
        } else {
            return 20000;
        }
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == USD) {
            return 0;
        } else {
            return 1 / 100;
        }
    }

    @Override
    int getCommission(int summ) {
        if (getCurrency() == USD && summ <= 1000) {
            return (int) (summ * 0.05);
        } else if (getCurrency() == USD && summ > 1000) {
            return (int) (summ * 0.07);
        } else if (getCurrency() == EUR && summ <= 1000) {
            return (int) (summ * 0.02);
        } else {
            return (int) (summ *0.04);
        }
    }

    @Override
    public String toString() {
        return "EUBank";
    }
}
//EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
//        лимит пополнения - 20000, если EUR и 10000, если USD
//        месячная ставка - 0% на USD и 1% на EUR
//        комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
//        2%, если EUR и до 1000 и 4%, если EUR и больше 1000
