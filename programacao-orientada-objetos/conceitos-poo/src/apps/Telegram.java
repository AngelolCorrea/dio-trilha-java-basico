package apps;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviado pelo apps.Telegram");;
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebido pelo apps.Telegram");;
    }
}
