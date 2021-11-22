public class ejercicio20 {
  public static void main(String[] args) {
    /* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
    agua. La capacidad será indicada por el usuario. La cuba se llenará con una
    cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
    pueda admitir. El ancho de la cuba no varía. */
    int capacidad;
    System.out.print("Por favor, introduzca la capacidad de la cuba: ");
    capacidad=Integer.parseInt(System.console().readLine());
    int agua;
    agua = (int) ((Math.random()*(capacidad))+1);
    for (int i = capacidad; i > 0; i--) {
      if (i>1) {
        System.out.print("*");
      }
      for (int j = 1; j < 7; j++) {
        if ((i==capacidad)&&(j<5)&&(agua<capacidad)) {
          System.out.print(" ");
        }
        if ((i<capacidad)&&(i>agua)&&(j<5)&&(i>1)) {
          System.out.print(" ");
        }
        if ((i<=capacidad)&&(i<=agua)&&(j<5)&&(i>1)) {
          System.out.print("=");
        }
        if ((j==6)&&(i>1)) {
          System.out.print("*");
        }
        if (i==1) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
