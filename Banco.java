public class Banco {

    private INotificador notificador;

    public Banco(INotificador notificador) {
        this.notificador = notificador;
    }

    public void executarRotinaMensal(Conta listaContas) {
        System.out.println("============");
        listaContas.exibirDados();
        listaContas.atualizarSaldo();

    }

    public void processar() {
        notificador.enviarMensagem("O seu saldo é de: ");
    }

}

