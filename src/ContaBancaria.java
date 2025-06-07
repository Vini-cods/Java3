public class ContaBancaria {

    public String nome;
    public double balance;
    public double interestRate;

    public ContaBancaria(String nome, double balance, double interestRate) {
        this.nome = nome;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    //retorno nulo
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Saldo insuficiente!");
        } else {
            balance -= amount;

        }
    }
}
