import java.time.LocalDate;

public class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated = LocalDate.now();
    
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = LocalDate.now();
    }
}