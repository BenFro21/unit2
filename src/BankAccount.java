public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        // this in this case is refering to the constructor below. It sets the defaults of the constructor
        this(123456, 2.50, "Default name", "Default adress", 123456789);
    }
    // normal constructor
    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        // this is how you set a default value in the constuctor. Using the 1st constructor above
        this(9999, 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double value) {
        this.balance = this.balance + value;
        System.out.println("Deposited " + value);
    }

    public void withdrawl(double value) {
        if(balance - value < 0){
            System.out.println("Only " + balance + " avalable");
        }else {
            this.balance = this.balance - value;
            System.out.println("withdrew " + value);

        }

    }

    public void setAccountNumber(int acctNum) {
        this.accountNumber = acctNum;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }


}
