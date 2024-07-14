public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviado pelo Messenger");;
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebido pelo messenger");;
    }
}
