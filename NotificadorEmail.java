public class NotificadorEmail implements INotificador {
    public void enviarMensagem (String msg) {
        System.out.println("Email - " + msg);
    }
}
