public class ejercicio6 {
  public static void main(String[] args) {
   /*  Escribe un programa que lea 15 números por teclado y que los almacene en un
    array. Rota los elementos de ese array, es decir, el elemento de la posición 0
    debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
    la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
    del array. */
    int [] numero = new int [15];
    int aux;
    System.out.println("Introduzca 15 números: ");
    for (int i = 0; i < 15; i++) {
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    aux=numero[14];
    for (int i = 14; i > 0; i--) {
      numero[i] = numero[i - 1];
      /* aux=numero[i+1];
      numero[i+1]=numero[i];
      numero[i+2]=aux; */
    }
    numero[0]=aux;
    for (int i = 0; i < 15; i++) {
      System.out.println(numero[i]);
    }
  }
}