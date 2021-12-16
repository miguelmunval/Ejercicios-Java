public class ejercicio8 {
  public static void main(String[] args) {
    /* Realiza un programa que pida la temperatura media que ha hecho en cada mes
    de un determinado año y que muestre a continuación un diagrama de barras
    horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
    de asteriscos o cualquier otro carácter. */
    int [] media = new int [12];
    for (int i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media del mes "+(i+1)+": ");
      media[i]=Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < 12; i++) {
      if ((i+1)<10) {
        System.out.print((i+1)+"  |");
      } else {
        System.out.print((i+1)+" |");
      }
      for (int j = 0; j < media[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
