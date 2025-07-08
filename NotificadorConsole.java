public class NotificadorConsole implements INotificador {
    @Override
    public void enviarMensagem (String msg) {
        System.out.println("Console - " + msg);
    }
}
