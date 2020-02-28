
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Filme;

public class Main {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente c1 = new Cliente("João","12345678");
		Cliente c2 = new Cliente("Maria","87654321");
		
		Filme a1 = new Filme("BATMAN");
		Filme a2 = new Filme("X-MEN");
		Filme a3 = new Filme("HULK");
		Filme a4 = new Filme("IRON MAN");
		
	
		c1.emprestar(a1);
		c1.emprestar(a3);
		
		System.out.println(c1);
		
		c1.devolver(a1);
		c1.devolver(a3);
		
		System.out.println(c1);
		
		
		
		
		
		
		
		sc.close();
	}

}
