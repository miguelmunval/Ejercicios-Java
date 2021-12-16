public class ejercicio6 {
  public static void main(String[] args) {
    /* Modifica el programa anterior de tal forma que no se repita ningún número en
    el array. */
    int [][] numeros = new int [6][10];
    boolean repetido=false;
    int minimo=1000;
    int pminimoi=0;
    int pminimoj=0;
    int maximo=0;
    int pmaximoj=0;
    int pmaximoi=0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        int contador = 0;
        do {
          repetido = false;
          numeros [i][j] = (int) (Math.random() * 1001);
          for (contador = 0; contador < 10 * i + j; contador++) {
            if (numeros [i][j] == numeros [contador / 10][contador % 10]) repetido = true;
          }
        } while (repetido);
        if (numeros[i][j]<minimo) {
          minimo=numeros[i][j];
          pminimoi=i;
          pminimoj=j;
        }
        if (numeros[i][j]>maximo) {
          maximo=numeros[i][j];
          pmaximoi=i;
          pmaximoj=j;
        }
      }
    }
    System.out.println("El número mínimo está en la posición: "+pminimoi+", "+pminimoj);
    System.out.println("El número máximo está en la posición: "+pmaximoi+", "+pmaximoj);
  }
}
