package palindromo;

import java.util.Scanner;

public class Elpali {
		
	public static void main(String[] args) 
    { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra:");
		String palabra1 = sc.nextLine();
		System.out.println("Introduzca otra palabra:");
		String palabra2 = sc.nextLine();
		
		if(palindromo(palabra1,palabra2) == true) {
			System.out.print("Es un palindromo");
		}else {
			System.out.print("No es un palindromo");
		}
		
	} 
	
	/**
	* Comprueba si dos palabras forman un <code>palíndromo</code>.
	* <br>Serán un palíndromo si una palabra es igual que la otra al revés.
	* <br>Para ello le da la vuelta a la segunda y comprueba si es igual a la primera.
	* <pre>
	* if (palabra1 == palabra2Girada)
	* ...
	* </pre>
	*
	* @param palabra1 una de las palabras a comprobar
	* @param palabra2 la otra palabra para comprobar
	* @return si forman un palíndromo o si no
	*/
	public static boolean palindromo(String palabra1, String palabra2) {
	 StringBuilder palabra2Girada = new StringBuilder(palabra2);
	 palabra2Girada = palabra2Girada.reverse();
	 if (palabra1.equals(palabra2Girada.toString()))
	 return true;
	 else
	 return false;
	}
}
