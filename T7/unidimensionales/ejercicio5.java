public class ejercicio5 {
  public static void main(String[] args) {
    /* Escribe un programa que pida 10 números por teclado y que luego muestre los
    números introducidos junto con las palabras “máximo” y “mínimo” al lado del
    máximo y del mínimo respectivamente. */
    int [] numero = new int [10];
    int max = 0;
    int min = 200000000;
    System.out.println("Introduzca 10 números: ");
    for (int i = 0; i < 10; i++) {
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < 10; i++) {
      if (numero[i]>max) {
        max=numero[i];
      } else if (numero[i]<min) {
        min=numero[i];
      }
    }
    for (int i = 0; i < 10; i++) {
      if (numero[i]== max) {
        System.out.print(numero[i]+" máximo");
      } else if (numero[i]== min) {
        System.out.print(numero[i]+" mínimo");
      } else {
        System.out.print(numero[i]);
      }
      System.out.print(", ");
    }
  }
}
