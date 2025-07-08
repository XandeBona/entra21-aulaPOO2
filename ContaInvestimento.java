public class ContaInvestimento extends Conta{

    public ContaInvestimento(String titular, Double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void atualizarSaldo() {
        saldo += (saldo * 0.02) - 5;
    }
}
