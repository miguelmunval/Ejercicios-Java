public class ejercicio15 {
	public static void main(String[] args) {
		/* Realiza un generador de melodía con las siguientes condiciones:
		a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
		la y si.
		b) Una melodía está formada por un número aleatorio de notas mayor o igual
		a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
		c) Cada grupo de 4 notas será un compás y estará separado del siguiente
		compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
		con dos barras.
		d) La última nota de la melodía debe coincidir con la primera. */
		int aleatorio;
		int longitud=(int)((Math.random()*7)+1);
		for (int i = longitud; i > 0; i--) {
			for (int j = 0; j < 4; j++) {
				aleatorio=(int)(Math.random()*7);
				switch (aleatorio) {
					case 0:
						System.out.print("re ");
						break;
					case 1:
					System.out.print("mi ");
						break;
					case 2:
					System.out.print("fa ");
						break;
					case 3:
					System.out.print("sol ");
						break;
					case 4:
					System.out.print("la ");
						break;
					case 5:
					System.out.print("si ");
						break;
					default:
						System.out.print("do ");
						break;
				}
			}
			System.out.print("| ");
		}
	}
}
