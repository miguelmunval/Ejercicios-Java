public class ejercicio22 {
  public static void main(String[] args) {
  System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
  String dia = System.console().readLine();
  int dianum = 0;
  switch(dia) {
    case "lunes":
    dianum = 0;
    break;
    case "martes":
    dianum = 1;
    break;
    case "miércoles":
    case "miercoles":
    dianum = 2;
    break;
    case "jueves":
    dianum = 3;
    break;
    case "viernes":
    dianum = 4;
    break;
    default:
    System.out.print("El día introducido no es correcto.");
    }
  System.out.println("A continuación introduzca la hora (hora y minutos)");
  System.out.print("Hora: ");
  int horas = Integer.parseInt(System.console().readLine());
  System.out.print("Minutos: ");
  int min = Integer.parseInt(System.console().readLine());
  int mintotales = (4 * 24 * 60) + (15 * 60);
  int minactuales = (dianum * 24 * 60) + (horas * 60) + min;
  System.out.print("Faltan " + (mintotales - minactuales) + " minutos para llegar al\fin de semana.");
  }
}
