public class Main {


  /**
   * param args.
   */
  public static void main(String[] args) {

    // Creates a checking account and a deposit account for the same person
    Client carol = new Client();
    carol.setName("Carol");
    carol.setCpf("012.345.678-90");

    Account ca = new CheckingAccount(carol);
    Account da = new DepositAccount(carol);

    // Puts the accounts on the bank accounts array
    Bank.createAccount(ca);
    Bank.createAccount(da);

    // Deposit and transfer between accounts (same client)
    ca.deposit(100);
    ca.transfer(100, da);

    // Print the balance
    ca.printBalance();
    da.printBalance();

    // Create new client and put the account on array
    Client bruno = new Client();
    bruno.setName("Bruno");
    bruno.setCpf("987.456.321-09");

    Account ca1 = new CheckingAccount(bruno);

    Bank.createAccount(ca1);

    // Deposit and withdraw
    ca1.deposit(1500);
    ca1.withdraw(700);

    // Create new client and put the account on array
    Client becky = new Client();
    becky.setName("Becky");
    becky.setCpf("333.666.999-77");

    Account da1 = new DepositAccount(becky);

    Bank.createAccount(da1);

    // Deposit and transfer between account (other client)
    da1.deposit(3500);
    da1.transfer(900, ca);

    // Show all accounts
    Bank.printAllAccounts();
  }
}
