package matematicas;

public class ejercicios29_34 {
  public static int [][] generaArrayBiInt (int n, int m, int min, int max) {

    int [][] array = new int [n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        array[i][j] = (int) (Math.random() * (max - min + 1) + min);
      }
    }

    return array;
  }

  public static int[] filaDeArrayBiInt (int[][] array, int i) {

    int[] fila = new int [array.length];

    for (int j = 0; j < array.length; j++) {
      fila[j] = array[j][i];
    }

    return fila;
  }

  public static int[] columnaDeArrayBiInt (int[][] array, int i) {

    int[] columna = new int [array[0].length];

    for (int j = 0; j < array[0].length; j++) {
      columna[j] = array[i][j];
    }

    return columna;
  }

  public static int[] coordenadasEnArrayBiInt (int[][] array, int n) {

    int[] posicion = new int [2];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++){
        if (array [i][j] == n) {
          posicion[0] = i;
          posicion[1] = j;
          return posicion;
        }
      }
    }

    posicion[0] = -1;
    posicion[1] = -1;
    
    return posicion;
  }

  public static boolean esPuntoDeSilla (int[][] array, int n) {

    int[] posicion = coordenadasEnArrayBiInt (array, n);

    if (posicion[0] == -1 && posicion[1] == -1) return false;

    for (int i = 0; i < array.length; i++) {
      if (array [posicion[0]][i] > array [posicion[0]][posicion[1]]) return false;
    }

    for (int i = 0; i < array[0].length; i++) {
      if (array [posicion[i]][1] < array [posicion[0]][posicion[1]]) return false;
    }

    return true;
  }

  public static int[] diagonal (int [][] array, int fila, int columna, String coordenadas) {
    int [] posicion = {1, 2, 3};
    return posicion;
  }
}
