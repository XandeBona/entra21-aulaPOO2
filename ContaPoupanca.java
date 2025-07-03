public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, Double saldo) {
        super(titular, saldo);
    }

    @Override
    public void atualizarSaldo() {
        System.out.println("O saldo atual é de R$ " + (saldo + (saldo * 0.01)));
    }
}
