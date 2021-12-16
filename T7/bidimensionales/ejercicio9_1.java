public class ejercicio9_1 {
  public static void main(String[] args) {
    final int LADO = 12;

    int [][] numeros = new int[LADO][LADO];
    int [][] numerosf = new int[LADO][LADO];

    for (int i = 0; i < LADO; i++) {
      for (int j = 0; j < LADO; j++) numeros[i][j] = (int) (Math.random() * 101);
    }

    for (int i = 0; i < LADO; i++) {
      for (int j = 0; j < LADO; j++) System.out.printf("%3d ", numeros[i][j]);
      System.out.println();
      System.out.println();
    }

    System.out.println();

    for (int k = 0; k < LADO / 2; k++) {
      for (int i = 1 + k; i < LADO - k; i++) numerosf[k][i] = numeros[k][i-1];

      for (int i = k; i < LADO - k - 1; i++) numerosf [i][k] = numeros[i+1][k];
     
      for (int i = k + 1; i < LADO - k; i++) numerosf[i][LADO - k - 1] = numeros[i-1][LADO - k - 1];
      
      for (int i = k; i < LADO - k - 1; i++) numerosf[LADO-k-1][i] = numeros[LADO-k-1][i + 1];
    }

    for (int i = 0; i < LADO; i++) {
      for (int j = 0; j < LADO; j++) System.out.printf("%3d ", numerosf[i][j]);
      System.out.println();
      System.out.println();
    }
  }
}
