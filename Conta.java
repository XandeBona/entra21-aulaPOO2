public abstract class Conta {
    protected String titular;
    protected Double saldo;

    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void atualizarSaldo();

    public void depositar(double valor) {
        System.out.println(saldo + valor);
    }

    public void sacar(double valor) {
        System.out.println(saldo - valor);
    }

    public void exibirDados() {
        System.out.println("Nome do titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
