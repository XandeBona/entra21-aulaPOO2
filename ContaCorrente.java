public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, Double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void atualizarSaldo() {
        saldo -= 10;
    }

}
