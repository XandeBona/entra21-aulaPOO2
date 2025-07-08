import java.util.List;

public class Banco {

    private INotificador notificador;

    public Banco(INotificador notificador) {
        this.notificador = notificador;
    }

    public void executarRotinaMensal(List<Conta> contas) {
        for (Conta conta : contas) {
            conta.atualizarSaldo();
        }
        notificador.enviarMensagem("Rotina mensal executada!!");
    }
}