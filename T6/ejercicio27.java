public class ejercicio27 {
  public static void main(String[] args) {
    /* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
    jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
    introduce una opción incorrecta, el programa deberá mostrar un mensaje de
    error. */
    String jugador="";
    int aleatorio;
    String ordenador="";
    System.out.print("Tu turno, ¿piedra, papel o tijeras?: ");
    jugador=System.console().readLine();
    aleatorio=(int)(Math.random()*3);
    switch (aleatorio) {
      case 0:
        ordenador="piedra";
        break;
      case 1:
        ordenador="papel";
        break;
      case 2:
        ordenador="tijeras";
        break;
      default:
        break;
    }
    System.out.println("Turno de la máquina: "+ordenador);
    if (ordenador.equals(jugador)) {
      System.out.println("empate");
    }
    if ((ordenador.equals("piedra"))&&(jugador.equals("tijeras"))) {
      System.out.println("gana la máquina");
    }
    if ((ordenador.equals("papel"))&&(jugador.equals("tijeras"))) {
      System.out.println("gana el jugador");
    }
    if ((ordenador.equals("piedra"))&&(jugador.equals("papel"))) {
      System.out.println("gana el jugador");
    }
    if ((ordenador.equals("papel"))&&(jugador.equals("piedra"))) {
      System.out.println("gana la máquina");
    }
    if ((ordenador.equals("tijeras"))&&(jugador.equals("piedra"))) {
      System.out.println("gana el jugador");
    }
    if ((ordenador.equals("tijeras"))&&(jugador.equals("papel"))) {
      System.out.println("gana la máquina");
    }
  }
}
