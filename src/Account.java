public class Account {
    final private int id;
    private String name;
    private double balance;

    static int numberOfAccounts = 0;

    public Account(String name, double balance) {
        this.id = numberOfAccounts;
        this.name = name;
        this.balance = balance;

        numberOfAccounts++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
