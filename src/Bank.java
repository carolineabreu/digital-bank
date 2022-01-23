import java.util.ArrayList;

public class Bank {

  private String name;
  private static ArrayList<Account> accounts = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void createAccount(Account account) {
    accounts.add(account);
  }

  /**
   * Method to print all accounts in bank.
   */
  public static void printAllAccounts() {
    System.out.println("=== Accounts: ===");
    for (Account account : accounts) {
      System.out.println("Client: " + account.getClient());
      System.out.println("CPF: " + account.client.getCpf());
      System.out.println("Number: " + account.getNumber());
      System.out.println("Balance: " + account.getBalance());
    }
  }
}
