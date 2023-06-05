import entities.Conta;
import entities.ContaCorrente;

public class Program {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente();
        Conta conta2 = new ContaCorrente();

        conta.setTitular("Titular 01");
        conta2.setTitular("Titular 02");
        conta.depositar(200);
        conta2.depositar(100);

        conta.sacar(100);
        conta2.sacar(100);

        conta.transferir(conta2, 50);

        System.out.println("Conta" + conta);
        System.out.println("Conta" + conta2);

    }

}
