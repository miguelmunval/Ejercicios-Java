public class ejercicio3 {
  public static void main(String[] args) {
    /* Escribe un programa que lea 10 números por teclado y que luego los muestre
    en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    y viceversa. */
    int [] numero = new int [11];
    System.out.println("Intoduzca 10 números.");
    for (int i = 1; i < 11; i++) {
      System.out.print("introduzca el número "+i+": ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 10; i > 0 ; i--) {
      System.out.print(numero[i]+", ");
    }
  }
}
