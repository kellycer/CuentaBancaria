public class DatosDeCuenta {
    private String Name;
    private String LastName;
    private double Balance;
    private int AccountsNumber;

    public DatosDeCuenta(String name, String LastName, double Balance, int AccountsNumber){
        this.Name= name;
        this.LastName= LastName;
        this.Balance= Balance;
        this.AccountsNumber = AccountsNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public int getAccountsNumber() {
        return AccountsNumber;
    }

    public void setAccountsNumber(int accountsNumber) {
        AccountsNumber = accountsNumber;
    }

    @Override
    public String toString() {
        System.out.println("titular de la cuenta: " + this.Name + this.LastName);
        System.out.println("número de la cuenta: " + this.AccountsNumber);
        System.out.println("saldo de la cuenta: " + this.Balance);
        return "";

    }
}



