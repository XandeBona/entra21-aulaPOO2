public class NotificadorEmail implements INotificador {
    @Override
    public void enviarMensagem (String msg) {
        System.out.println("Email - " + msg);
    }
}
