public class ejercicio11 {
  public static void main(String[] args) {
    /* Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice
    (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
    primos a las primeras posiciones, desplazando el resto de números (los que no
    son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
    array resultante. */
    int[] numeros = new int[10];
    int[] primos = new int[10];
    int[] resto = new int[10];
    int cantPrimos = 0;
    int cantResto = 0;
    int divisores;

    for (int i = 0; i < 10; i++) {

      System.out.print("Introduce un número entero: ");
      numeros[i] = Integer.parseInt(System.console().readLine());

      divisores = 0;

      for (int j = 1; j <= numeros[i]; j++) {
        if (numeros [i] % j == 0) divisores++;
      }

      if (divisores > 2) {
        primos[cantPrimos] = numeros[i];
        cantPrimos++;
      }else{
        resto[cantResto] = numeros[i];
        cantResto++;
      }
    }
    //Array inicial
    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numeros[i]);
    //Movimiento
    for (int i = 0; i < 10; i++) numeros[i] = primos[i];
    for (int i = cantPrimos; i < 10; i++) numeros[i] = resto[i - cantPrimos];
    //Array final
    System.out.println();
    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 9; i >= 0; i--) System.out.printf("%-4d", numeros[i]);
  }
}
