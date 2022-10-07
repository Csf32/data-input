import java.util.Locale;

public class exerciciofinal {

	public static void main(String[] args) {
		
		double L, C, Area, Preco;
		
		L = 10.0;
		C = 30.0;
		Preco = 200.00;
		Area = L * C;
		
		
		System.out.println("Área do terreno = " + Area);
		System.out.println("Valor do terreno = " + Preco * Area);
		

		
		Locale.setDefault(Locale.US);
		System.out.printf("Área do terreno = %.2f%n", Area);
		System.out.printf("Valor do terreno = %.2f%n", Preco);
	
	}

}
