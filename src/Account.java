public abstract class Account implements IAccount {

  protected static final int DEFAULT_BRANCH = 0001;

  protected int branch;
  protected int number;
  protected Client client;
  protected double balance;

  public Account(Client client) {
    this.branch = Account.DEFAULT_BRANCH;
    this.client = client;
  }

  @Override
  public void withdraw(double value) {
    this.balance -= value;
  }

  @Override
  public void deposit(double value) {
    this.balance += value;
  }

  @Override
  public void transfer(double value, Account destinationAccount) {
    this.withdraw(value);
    destinationAccount.deposit(value);
  }

  public int getBranch() {
    return branch;
  }

  public int getNumber() {
    return number;
  }

  public double getBalance() {
    return balance;
  }

  public String getClient() {
    return client.getName();
  }

  protected void printInfo() {
    System.out.println(String.format("Holder: %s", this.client.getName()));
    System.out.println(String.format("Branch: %d", this.branch));
    System.out.println(String.format("Number: %d", this.number));
    System.out.println(String.format("Balance: %.2f", this.balance));
  }
}
