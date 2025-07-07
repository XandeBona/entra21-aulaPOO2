public class Main {
    public static void main(String[] args) {
        INotificador notificador = new NotificadorEmail();
        Banco banco = new Banco(notificador);

        Conta contacorrente = new ContaCorrente (
                "Alexandre",
                1000.0
        );

        Conta contapoupanca = new ContaPoupanca(
                "Rafael",
                1000.0
        );


        Conta containvestimento = new ContaInvestimento(
                "Gabriel",
                1000.0
        );

        banco.executarRotinaMensal(contacorrente);
        banco.processar();
        banco.executarRotinaMensal(contapoupanca);
        banco.processar();
        banco.executarRotinaMensal(containvestimento);
        banco.processar();


    }
}