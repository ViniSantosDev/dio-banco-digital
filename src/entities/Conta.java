package entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta {

    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected String titular;
    protected int numeroConta;

    protected double saldo;

    protected int agencia;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = Conta.SEQUENCIAL++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }
    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", R$saldo=" + saldo +
                ", agencia=" + agencia +
                '}';
    }
}
