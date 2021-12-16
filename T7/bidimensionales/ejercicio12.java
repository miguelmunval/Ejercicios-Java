public class ejercicio12 {
  public static void main(String[] args) {
    /* Realiza un programa que muestre por pantalla un array de 9 filas por 9
    columnas relleno con números aleatorios entre 500 y 900. A continuación, el
    programa debe mostrar los números de la diagonal que va desde la esquina
    inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
    y la media de los números que hay en esa diagonal. */
    int [][] matriz = new int [9][9];
    int suma = 0;

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) matriz[i][j] = (int) (Math.random() * 401) + 500;
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) System.out.printf("%-4d", matriz[i][j]);
      System.out.println();
    }

    System.out.println();

    int contador = 8;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++){

        if (contador == j) {
          System.out.printf( "%-4d", matriz[i][j]);
          suma += matriz[i][j];
          contador--;
        }
        
      }
    }

    System.out.println();
    System.out.println("La media es: " + (double) suma / 9);
  }
}
