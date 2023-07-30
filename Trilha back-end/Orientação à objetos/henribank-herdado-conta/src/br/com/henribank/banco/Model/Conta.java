package br.com.henribank.banco.Model;

/**
 * Classe que representa a moldura de uma conta no Henribank.
 *
 * @author Henrique Gomes
 * @version  0.1
 */

public abstract class Conta implements Comparable<Conta> {
    protected double saldo;
    int agencia = 42;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     *
     * @param agencia: número da agência
     * @param numero: número da conta
     */
    public Conta(int agencia, int numero) {
        Conta.total ++;
        //System.out.println("Nº de contas: " + total);
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

    /**
     * Valor precisa ser maior que o saldo.
     *
     * @param valor: valor da transação
     * @throws SaldoInsuficienteException: exceção de valor insuficiente
     */
    public void sacar(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + saldo);
        } else {
            this.saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia){
            return false;
        }

        return this.numero != outra.numero;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + " Agencia: " + this.agencia;
    }

}
