public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos","12566677745");
        marcos.setEndereco("Rua das marias");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
