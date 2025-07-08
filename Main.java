import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente("Alexandre", 1000.0);
        Conta contaPoupanca = new ContaPoupanca("Rafael", 1000.0);
        Conta contaInvestimento = new ContaInvestimento("Gabriel", 1000.0);

        contaCorrente.depositar(500.0);
        contaPoupanca.sacar(300.0);
        contaInvestimento.depositar(1000.0);

        System.out.println("========");
        System.out.println("Antes da rotina mensal:");
        contaCorrente.exibirDados();
        contaPoupanca.exibirDados();
        contaInvestimento.exibirDados();

        INotificador notificador = new NotificadorConsole();

        Banco banco = new Banco(notificador);
        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente);
        contas.add(contaPoupanca);
        contas.add(contaInvestimento);

        System.out.println("--------------");
        banco.executarRotinaMensal(contas);
        System.out.println("--------------");

        System.out.println("========");
        System.out.println("Depois da rotina mensal:");
        contaCorrente.exibirDados();
        contaPoupanca.exibirDados();
        contaInvestimento.exibirDados();
    }
}