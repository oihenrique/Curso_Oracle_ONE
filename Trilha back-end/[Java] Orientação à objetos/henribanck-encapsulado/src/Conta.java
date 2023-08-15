public class Conta {
    private double saldo;
    int agencia = 42;
    private int numero;
    private Cliente titular;
    private static int total;

    // Construtor
    public Conta(int agencia, int numero) {
        Conta.total ++;
        System.out.println("Nº de contas: " + total);
        this.agencia = agencia;
        this.numero = numero;
    }

    // Getters e setters
    public double getSaldo() {
        return this.saldo;
    }
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("digite um número válido");
            return;
        }
        this.numero = numero;
    }
    public Cliente getTitular() {
        return this.titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("digite um número válido");
            return;
        }
        this.agencia = agencia;
    }

    public static int getTotal() {
        return total;
    }

    // métodos
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
