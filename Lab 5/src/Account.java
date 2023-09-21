import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }
    Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    //Setters:
    public void setId(int newId){
        id = newId;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate / 100.0;
    }

    //Getters:
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

    //Methods
    double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    void withdraw(double amount){
        balance -= amount;
    }
    void deposit(double amount){
        balance += amount;
    }

}
