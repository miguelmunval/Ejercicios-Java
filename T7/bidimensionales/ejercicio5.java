public class ejercicio5 {
  public static void main(String[] args) {
    /* Realiza un programa que rellene un array de 6 filas por 10 columnas con
    números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
    continuación, el programa deberá dar la posición tanto del máximo como del
    mínimo. */
    int [][] numeros = new int [6][10];
    int minimo=1000;
    int pminimoi=0;
    int pminimoj=0;
    int maximo=0;
    int pmaximoj=0;
    int pmaximoi=0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        numeros[i][j]=(int)(Math.random()*1001);
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
