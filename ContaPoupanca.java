public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, Double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void atualizarSaldo() {
        saldo += (saldo * 0.01);
    }
}
