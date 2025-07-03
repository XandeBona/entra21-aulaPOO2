import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaConta = new ArrayList<>();

        Conta contacorrente = new ContaCorrente (
                "Alexandre",
                1000.0
        );
        listaConta.add(contacorrente.toString());

        Conta contapoupanca = new ContaPoupanca(
                "Rafael",
                1000.0
        );
        listaConta.add(contapoupanca.toString());


        Conta containvestimento = new ContaInvestimento(
                "Gabriel",
                1000.0
        );
        listaConta.add(containvestimento.toString());


//        contacorrente.atualizarSaldo();
//        contapoupanca.atualizarSaldo();
//        containvestimento.atualizarSaldo();


    }
}