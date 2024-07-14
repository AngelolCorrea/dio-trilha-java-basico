package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviado pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebido pelo Facebook");;
    }
}
