public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

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
        banco.executarRotinaMensal(contapoupanca);
        banco.executarRotinaMensal(containvestimento);



    }
}