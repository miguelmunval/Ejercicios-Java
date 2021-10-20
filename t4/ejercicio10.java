public class ejercicio10{
  public static void main(String[]args){
  int dia;
  int mes;
  System.out.print("Introduzca su día de nacimiento: ");
  dia = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca su mes de nacimiento mediante un número(1-12): ");
  mes = Integer.parseInt(System.console().readLine());
  switch(mes) {
    case 1:
    if (dia <= 19){
      System.out.println("Su horóscopo es: Capricornio");
      } else {
        System.out.println("Su horóscopo es: Aquario");
        }
    break;
    case 2:
    if (dia <= 19){
      System.out.println("Su horóscopo es: Aquario");
      } else {
        System.out.println("Su horóscopo es: Piscis");
        }
    break;
    case 3:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Piscis");
      } else {
        System.out.println("Su horóscopo es: Aries");
        }
    break;
    case 4:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Aries");
      } else {
        System.out.println("Su horóscopo es: Tauro");
        }
    break;
    case 5:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Tauro");
      } else {
        System.out.println("Su horóscopo es: Géminis");
        }
    break;
    case 6:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Géminis");
      } else {
        System.out.println("Su horóscopo es: Cáncer");
        }
    break;
    case 7:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Cáncer");
      } else {
        System.out.println("Su horóscopo es: Leo");
        }
    break;
    case 8:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Leo");
      } else {
        System.out.println("Su horóscopo es: Virgo");
        }
    break;
    case 9:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Virgo");
      } else {
        System.out.println("Su horóscopo es: Libra");
        }
    break;
    case 10:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Libra");
      } else {
        System.out.println("Su horóscopo es: Escorpio");
        }
    break;
    case 11:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Escorpio");
      } else {
        System.out.println("Su horóscopo es: Sagitario");
        }
    break;
    case 12:
    if (dia <= 20){
      System.out.println("Su horóscopo es: Sagitario");
      } else {
        System.out.println("Su horóscopo es: Capricornio");
        }
    break;
    }
  }
}
