public class ContaInvestimento extends Conta{

    public ContaInvestimento(String titular, Double saldo) {
        super(titular, saldo);
    }

    @Override
    public void atualizarSaldo() {
        System.out.println("O saldo atual é de R$ " + (saldo + (saldo * 0.02) - 5));
    }
}
