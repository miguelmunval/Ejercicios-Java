public class ejercicio15 {
	public static void main(String[] args) {
		int aleatorio;
		for (int i = (int)((Math.random()*7)+1); i > 0; i--) {
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
