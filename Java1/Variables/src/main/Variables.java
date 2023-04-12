package main;

public class Variables {

	public static void main(String[] args) {

		/*
		 * 4 tipos de datos
		 * 
		 * Enteros Decimales Caracteres Booleanos
		 */

		int version; // Declaramos la variable
		version = 9; // Asignamos un valor
		version = 10;

		System.out.println(version); // Imprimimos

		int versionJava = 10;
		System.out.println(versionJava);

		float versionEspecifica = 9.8f;

		char letra = 'a';
		char numero = 97; // Referencia a un caracter

		System.out.println(letra);
		System.out.println(numero);

		boolean valor = true;
		boolean valor1 = false;

		/*
		 * long	8	–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		 * int	4	–2,147,483,648 a 2,147,483,647
		 * short	2	–32,768 to 32,767
		 * byte	1	–128 to 127
		 * 
		 */
		
		byte diasMes = 31; //Aproximadamente
		short diasLustro = (12 * 31) * 5;
		int velocidadLuz = 299792458;
		long añoLuz = velocidadLuz * 365;
	}

}
