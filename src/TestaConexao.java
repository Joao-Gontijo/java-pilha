
public class TestaConexao {
	public static void main(String[] args) {
		
		//try catch normal com finally
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.fecha();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			con.close();
//		}
		
		//try with resources - o finally é criado automatico e chama o close()
		try(Conexao con = new Conexao()) {
			con.leDados();
		} catch (Exception e) {
			System.out.println("Deu erro");
		}
	}
}
