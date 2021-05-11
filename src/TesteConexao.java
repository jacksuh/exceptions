public class TesteConexao implements AutoCloseable {

    public static void main(String[] args) {
        Conexao con = null;
        try {

            con = new Conexao();
            con.leDados();
            con.fecha();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Fechando conexao");
    }
}
