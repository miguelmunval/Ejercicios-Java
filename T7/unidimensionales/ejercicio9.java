public class ejercicio9 {
  public static void main(String[] args) {
    /* Realiza un programa que pida 8 números enteros y que luego muestre esos
    números junto con la palabra “par” o “impar” según proceda. */
    int [] numero = new int [8];
    System.out.println("Introduzca 8 números: ");
    for (int i = 0; i < 8; i++) {
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    for (int i = 0; i < 8; i++) {
      if ((numero[i]%2)==0) {
        System.out.print(numero[i]+" par");
      } else {
        System.out.print(numero[i]+" impar");
      }
      System.out.println();
    }
  }
}
