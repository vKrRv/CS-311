public class Task2 {
    public static void main(String[] args){
        Account acc1 = new Account(1122, 20000);
        acc1.setAnnualInterestRate(4.5);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.println("------------------------Account------------------------" +
                           "\nID: " + acc1.getId() +
                           "\nBalance: " + acc1.getBalance() +
                           "\nMonthly Interest: " + acc1.getMonthlyInterest() +
                           "\nAccount Date Created: " + acc1.getDateCreated() +
                           "\n-------------------------------------------------------");
    }
}
