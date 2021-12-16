import java.util.Scanner;

public class examen20_21_1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    /* posiciones caballo */
    String posicion;
    int columna;
    int fila;

    System.out.print("Introduce la posicion del caballo: ");
    posicion = s.nextLine();

    columna = (int) posicion.charAt(0) - 96;/*a=1 b=2...*/
    fila = Character.getNumericValue(posicion.charAt(2));
    s.close();
    for (int i = fila + 2; i >= fila - 2; i--) {
      for (int j = columna - 2; j <= columna + 2; j++) {
        if (Math.abs(j - columna) == 2 && Math.abs(i - fila) == 1) {
          System.out.printf("%c - %d\n", (char)(j + 96), i);
        }
        else if (Math.abs(j - columna) == 1 && Math.abs(i - fila) == 2) {
          System.out.printf("%c - %d\n", (char)(j + 96), i);
        } 
      }
    }
  }
}
