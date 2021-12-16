public class ejercicio19 {
  public static void main(String[] args) {
    /* Realiza un programa que sea capaz de insertar un número en una posición
    concreta de un array. En primer lugar, el programa generará un array de 12
    números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
    debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
    el programa preguntará por el número que se quiere insertar y por la posición
    donde será insertado. Los números del array se desplazan a la derecha para
    dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
    siempre se perderá. */
    int [] numeros = new int [12];
    int insertar;
    int posicion;
    for (int i = 0; i < 12; i++) {
      numeros[i]=(int)(Math.random()*201);
    }
    System.out.print("Indice: ");
    for (int i = 0; i < 12; i++) System.out.printf("%-4d", i);
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 12; i++) System.out.printf("%-4d", numeros[i]);
    System.out.println();
    System.out.print("¿Que número desea insertar? ");
    insertar=Integer.parseInt(System.console().readLine());
    System.out.print("¿En que posición desea insertarlo(0-11)? ");
    posicion=Integer.parseInt(System.console().readLine());
    for (int i = 11; i >= posicion; i--) {
      numeros[i] = numeros[i - 1];
      if (i==posicion) {
        numeros[i]=insertar;
      }
    }
    System.out.print("Indice: ");
    for (int i = 0; i < 12; i++) System.out.printf("%-4d", i);
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 12; i++) System.out.printf("%-4d", numeros[i]);
  }
}
