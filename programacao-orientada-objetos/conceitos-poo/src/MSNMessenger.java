public class MSNMessenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void recebeMensagem(){
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando conexao com internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagens");
    }
}
