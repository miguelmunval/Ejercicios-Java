public class ejercicio22 {
  public static void main(String[] args) {
    /* Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
    aleatorio. La cabeza se representará con el carácter @ y se debe colocar
    exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
    el cuerpo irá serpenteando de la siguiente manera: se generará de forma
    aleatoria un valor entre tres posibles que hará que el siguiente carácter se
    coloque una posición a la izquierda del anterior, alineado con el anterior o una
    posición a la derecha del anterior. La longitud de la serpiente se pedirá por
    teclado y se supone que el usuario introducirá un dato correcto. */
    int longitud;
    int posicion=13;
    int movimiento=0;
    System.out.print("Introduzca la longitud deseada para la serpiente: ");
    longitud=Integer.parseInt(System.console().readLine());
    for (int i = longitud; i > 0; i--) {
      for (int j = 1; j <= posicion+movimiento; j++) {
        if ((i<=longitud)&&(j!=posicion+movimiento)) {
          System.out.print(" ");
        }
        if ((i==longitud)&&(j==posicion+movimiento)) {
          System.out.println("@");
        }
        if ((i<longitud)&&(j==posicion+movimiento)) {
          System.out.println("*");
        }
      }
      movimiento=(int)((Math.random()*3)-1);
    }
  }
}
