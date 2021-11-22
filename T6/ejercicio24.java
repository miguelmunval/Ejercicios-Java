public class ejercicio24 {
  public static void main(String[] args) {
    /* Escribe un programa que, dado un número introducido por teclado, elija al azar
    uno de sus dígitos. */
    int numero;
    int aux;
    int longitud=0;
    int aleatorio;
    int digito=0;
    System.out.print("Introduzca un número: ");
    numero=Integer.parseInt(System.console().readLine());
    aux=numero;
    do {
      numero/=10;
      longitud++;
    } while (numero>0);
    aleatorio=(int)((Math.random()*longitud)+1);
    System.out.println(aleatorio);
    for (int i = 0; i < aleatorio; i++) {
      digito=aux%10;
      aux/=10;
    }
    System.out.println(digito);
  }
}
