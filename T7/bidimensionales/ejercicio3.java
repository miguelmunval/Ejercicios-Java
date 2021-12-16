public class ejercicio3 {
  public static void main(String[] args) {
    /* Modifica el programa anterior de tal forma que los números que se introducen
    en el array se generen de forma aleatoria (valores entre 100 y 999). */
    int [][] numeros = new int [4][5];
    int suma = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        numeros[i][j]=(int)((Math.random()*900)+100);
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
