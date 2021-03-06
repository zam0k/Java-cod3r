package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		//praticamente igual uma arrow function
		Calculo calculo = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calculo.executar(2, 3));
		
		calculo = (x, y) -> x * y;
		
		System.out.println(calculo.executar(2, 3));
		
		System.out.println(calculo.metodoDefault());
		System.out.println(Calculo.metodoEstatico());
	}
}
