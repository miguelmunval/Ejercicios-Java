public class ejercicio12 {
  public static void main(String[] args) {
    /* Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice
    (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
    “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
    números están entre 0 y 9. El programa deberá colocar el número de la posición
    inicial en la posición final, rotando el resto de números para que no se pierda
    ninguno. Al final se debe mostrar el array resultante. */
    int [] numero = new int [10];
    int aux;
    System.out.println("Introduzca 15 números: ");
    for (int i = 0; i < 10; i++) {
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numero[i]);
    System.out.println();
    aux=numero[9];
    for (int i = 9; i > 0; i--) {
      numero[i] = numero[i - 1];
      /* aux=numero[i+1];
      numero[i+1]=numero[i];
      numero[i+2]=aux; */
    }
    numero[0]=aux;
    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numero[i]);
  }
}
