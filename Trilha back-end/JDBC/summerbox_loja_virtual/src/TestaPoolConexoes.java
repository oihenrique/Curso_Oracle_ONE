public class TestaPoolConexoes {

    public static void main(String[] args) {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        for (int i = 0; i < 20; i++) {
            connectionFactory.recuperarConexao();
            System.out.println("Conexão nº " + i);
        }
    }
}
