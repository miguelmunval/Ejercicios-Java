public class ejerciciodeclase {
  public static void main(String[] args) {
    int tamaño, exterior, min, pintar;

    System.out.print("Introduzca el tamaño del anillo (impar): ");
    tamaño = Integer.parseInt(System.console().readLine());

    System.out.println();

    exterior = tamaño / 2 + 1;

    for (int i = 0; i < tamaño; i++) {
      pintar = exterior;

      for (int j = 1; j <= tamaño; j++) {
        System.out.print(pintar + " ");

        if (i + 1 > exterior) min = i - exterior + 2;
        else min = exterior - i;


        if (pintar > min && j < exterior) pintar--;
        else if (i + 1 > exterior) {
          if (j >= tamaño - (exterior - min)) pintar++;
        } else if (j >= tamaño - i) pintar++;
      }
      System.out.println();
    }
  }
}
