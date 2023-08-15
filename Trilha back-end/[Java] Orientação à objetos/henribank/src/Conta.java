public class Conta {
    double saldo;
    int agencia = 42;
    int numero;
    String titular;

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return  false;
    }
}
