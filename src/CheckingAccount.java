public class CheckingAccount extends Account {

  private static int SEQUENTIAL = 1;

  public CheckingAccount(Client client) {
    super(client);
    super.number = SEQUENTIAL++;
  }

  @Override
  public void printBalance() {
    System.out.println("=== Checking Account Balance ===");
    super.printInfo();
  }
}
