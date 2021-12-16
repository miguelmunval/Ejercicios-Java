public class ejercicio11 {
  public static void main(String[] args) {
    /* Realiza un programa que muestre por pantalla un array de 10 filas por 10
    columnas relleno con números aleatorios entre 200 y 300. A continuación, el
    programa debe mostrar los números de la diagonal que va desde la esquina
    superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
    y la media de los números que hay en esa diagonal. */
    int [][] matriz = new int [10][10];
    int suma = 0;

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) matriz[i][j] = (int) (Math.random() * 101) + 200;
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) System.out.printf("%-4d", matriz[i][j]);
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++){

        if (i == j) {
          System.out.printf( "%-4d", matriz[i][j]);
          suma += matriz[i][j];
        }
        
      }
    }

    System.out.println();
    System.out.println("La media es: " + (double) suma / 10);
  }
}
