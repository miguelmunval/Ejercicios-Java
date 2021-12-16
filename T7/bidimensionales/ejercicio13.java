public class ejercicio13 {
  public static void main(String[] args) {
    /* Realiza un programa que calcule la estatura media, mínima y máxima en
    centímetros de personas de diferentes países. El array que contiene los
    nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
    “Australia”}. Los datos sobre las estaturas se deben simular mediante un
    array de 4 filas por 10 columnas con números aleatorios generados al azar entre
    140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
    los países se deben mostrar utilizando el array de países (no se pueden escribir
    directamente). */
    String paises[] = {"España", "Rusia", "Japón", "Australia"};

    int alturas[][] = new int[4][10];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) alturas[i][j] = (int) (Math.random() * 71) + 140;
    }

    for (int i = 0; i < 4; i++) {
      int suma = 0;
      System.out.printf("%9s:", paises[i]);

      for (int j = 0; j < 10; j++) {
        System.out.printf("%4d", alturas[i][j]);
        suma += alturas[i][j];
      }

      System.out.printf(" |%4d\n", suma / 10);
    }
  }
}
