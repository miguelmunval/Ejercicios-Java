public class ejercicio9_2 {
  public static void main(String[] args) {
    /* Realiza un programa que sea capaz de rotar todos los elementos de una matriz
    cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
    12 filas por 12 columnas y debe contener números generados al azar entre 0 y
    100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
    con los números convenientemente alineados. */
    int [][] numeros = new int [12][12];
    int [][] aux=new int [1][1];
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        numeros[i][j]=(int)(Math.random()*101);
      }
    }
    System.out.println("Matriz original:");
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        System.out.printf("%-4d",numeros[i][j]);
      }
      System.out.println();
      System.out.println();
    }
    System.out.println();
    aux[0][0]=numeros[0][11];
    for (int i = 11; i > 0; i--) {
      for (int j = 11; j > 0; j--) {
        numeros[i][j] = numeros[i - 1][j-1];
      }
    }
    numeros[11][11]=aux[0][0];
    System.out.println("Matriz resultante:");
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        System.out.printf("%-4d",numeros[i][j]);
      }
      System.out.println();
      System.out.println();
    }
  }
}
