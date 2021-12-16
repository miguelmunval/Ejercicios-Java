public class ejercicio4 {
  public static void main(String[] args) {
    /* Modifica el programa anterior de tal forma que las sumas parciales y la suma
    total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
    que el ordenador se queda “pensando” antes de mostrar los números. */
    int [][] numeros = new int [4][5];
    int total = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        numeros[i][j]=(int)((Math.random()*900)+100);        
        total+=numeros[i][j];
      }
    }
    int fila, columna;
    for(columna = 0; columna < 5; columna++) {
    System.out.print(" Columna " + columna);
    }
    System.out.println();
    for(fila = 0; fila < 4; fila++) {
      System.out.print("\n" + fila);
      for(columna = 0; columna < 5; columna++) {
      System.out.printf("%9d ", numeros[fila][columna]);
      }
    }
    System.out.print(total+" ");
  }
}
