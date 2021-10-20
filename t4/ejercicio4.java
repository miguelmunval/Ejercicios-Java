public class ejercicio4 {
  public static void main (String[]args){
  int horas;
  int sueldo;
  System.out.print("Introduzca el número de horas trabajadas: ");
  horas = Integer.parseInt(System.console().readLine());
  if (horas <= 40){
    sueldo = horas * 12;
    System.out.println("Su salario es de: "+sueldo+" euros");
    } else {
      sueldo = (40 * 12) + ((horas-40)*16);
      System.out.println("Su salario es de: "+sueldo+" euros");
      }
  }
}
