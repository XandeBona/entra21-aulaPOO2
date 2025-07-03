public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, Double saldo) {
        super(titular, saldo);
    }

    @Override
    public void atualizarSaldo() {
        System.out.println("O saldo atual é de R$ " + (saldo - 10));
    }

}
