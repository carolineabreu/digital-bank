public class DepositAccount extends Account {

  private static int SEQUENTIAL = 100;

  public DepositAccount(Client client) {
    super(client);
    super.number = SEQUENTIAL++;
  }

  @Override
  public void printBalance() {
    System.out.println("=== Deposit Account Balance ===");
    super.printInfo();
  }
}
