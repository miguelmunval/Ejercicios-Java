public class ejerciciodeclase2 {
  public static void main(String[] args) {
    int numero;
		System.out.print("Introduzca un número impar: ");
		numero=Integer.parseInt(System.console().readLine());
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				if (((i==0)||(i==9))||(((i>=1)&&(i<=numero-1)) && (j==0))) {
					System.out.print(numero/2+1+" ");
				}
				if (((i==1)&&(j>0)&&(j<numero-1))||(((i>=2)||(i<numero-1))&&((j==0)||(j==numero-2)))) {
					System.out.print(numero/2+" ");
				}
				if (((i==2)||(i==numero-3))&&((j>1)&&(j<numero-2))) {
					System.out.print(numero/2-1+" ");
				}
			}
			System.out.println();
		}
	}
}
