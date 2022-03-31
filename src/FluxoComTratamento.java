
public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Init do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		throw new NullPointerException("Exceção aqui");
		//System.out.println("Fim do metodo2");
	}
}
