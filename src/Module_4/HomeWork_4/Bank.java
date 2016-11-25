package Module_4.HomeWork_4;

/**
 * Created by guzya on 20.11.2016.
 */
public abstract class Bank {
    private long id;
    private String bankCountry;
    private Module_4.HomeWork_4.Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(long id, String bankCountry, Module_4.HomeWork_4.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Module_4.HomeWork_4.Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee * numberOfEmployees;
    }
}
//    Домашнее задание №4.1

//        Создайте следующую структуру:
//        1. Абстрактный класс Bank и 3 класса, которые его расширяют: USBank, EUBank, ChinaBank.
//
//        Абстрактный класс Bank должен содержать поля:
//        long id
//        String bankCountry
//        Currency currency
//        int numberOfEmployees
//        double avrSalaryOfEmployee
//        long rating
//        long totalCapital
//
//        Создайте get-,set-методы и конструктор с аргументами - всеми полями.
//        Методы:
//abstract int getLimitOfWithdrawal()
//abstract int getLimitOfFunding()
//abstract int getMonthlyRate()
//abstract int getCommission(int summ)
//        double moneyPaidMonthlyForSalary()