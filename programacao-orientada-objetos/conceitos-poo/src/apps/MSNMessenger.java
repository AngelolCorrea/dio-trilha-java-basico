package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviado pelo Messenger");;
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebido pelo messenger");;
    }
}
