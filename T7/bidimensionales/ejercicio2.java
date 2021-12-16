public class ejercicio2 {
  public static void main(String[] args) {
    /* Escribe un programa que pida 20 números enteros. Estos números se deben
    introducir en un array de 4 filas por 5 columnas. El programa mostrará las
    sumas parciales de filas y columnas igual que si de una hoja de cálculo se
    tratara. La suma total debe aparecer en la esquina inferior derecha. */
    int [][] numeros = new int [4][5];
    int suma = 0;
    System.out.println("Introduzca 20 números:");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        numeros[i][j]=Integer.parseInt(System.console().readLine());
        suma+=numeros[i][j];
      }
    }
    int fila, columna;
    System.out.print(suma+" ");
    for(columna = 0; columna < 5; columna++) {
    System.out.print(" Columna " + columna);
    }    
    for(fila = 0; fila < 4; fila++) {
      System.out.print("\nFila " + fila);
      for(columna = 0; columna < 5; columna++) {
      System.out.printf("%9d ", numeros[fila][columna]);
      }
    }
  }
}
