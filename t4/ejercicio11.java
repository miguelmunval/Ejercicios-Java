public class ejercicio11{
  public static void main(String[]args){
  int horas;
  int minutos;
  int segundos;
  int dia = 86400;
  System.out.print("Introduzca la hora: ");
  horas = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el minuto: ");
  minutos = Integer.parseInt(System.console().readLine());
  segundos = dia - ((horas * 3600) + (minutos * 60));
  System.out.println("Quedan "+segundos+" segundos para medianoche");
  }
}
