// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount(1257, 50000.0, "Bob Brown", "bob@bob.com", 231555231);
        bobsAccount.deposit(50.0);
        bobsAccount.deposit(51.00);
        bobsAccount.withdrawl(25.0);
        System.out.println(bobsAccount.getBalance());
        }
}