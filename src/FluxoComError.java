
public class FluxoComError {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	public static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	
	public static void metodo2() {
		System.out.println("inicio do metodo2");
		metodo2();
		System.out.println("fim do metodo2");
	}
}
