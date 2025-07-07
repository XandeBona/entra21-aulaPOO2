public class NotificadorConsole implements INotificador {
    public void enviarMensagem (String msg) {
        System.out.println("Console - " + msg);
    }
}
