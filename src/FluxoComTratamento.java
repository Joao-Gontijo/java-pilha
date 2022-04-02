
public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Init do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (MinhaExcecao e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("Deu muiro errado");
		//System.out.println("Fim do metodo2");
	}
}
