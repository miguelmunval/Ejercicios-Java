public class ejercicio9{
  public static void main(String[]args){
  double a, b, c;
  double x1, x2;
  /*captura de datos*/
  System.out.print("Introduzca el valor de a: ");
  a = Double.parseDouble(System.console().readLine());
  if (a == 0){
    System.out.print("Introduzca el valor de b: ");
  b = Double.parseDouble(System.console().readLine());
  if (b == 0){
    System.out.println("Introduzca un valor distinto de 0");
    return;
    }
  System.out.print("Introduzca el valor de c: ");
  c = Double.parseDouble(System.console().readLine());
  if (c == 0){
    System.out.println("Introduzca un valor distinto de 0");
    return;
    }
  /*calculo de soluciones*/
  x1 = -c/b;
  x2 = x1;
  /*presentación de resultados*/
  System.out.println("Las soluciones son: ");
  System.out.println("x1 = "+x1);
  System.out.println("x2 = "+x2);
    } else {
  System.out.print("Introduzca el valor de b: ");
  b = Double.parseDouble(System.console().readLine());
  if (b == 0){
    System.out.println("Introduzca un valor distinto de 0");
    return;
    }
  System.out.print("Introduzca el valor de c: ");
  c = Double.parseDouble(System.console().readLine());
  if (c == 0){
    System.out.println("Introduzca un valor distinto de 0");
    return;
    /*calculo de soluciones*/
    double radicando;
    radicando = b*b-4*a*c;
    if (radicando >= 0) {
    x1 = (-b + Math.sqrt(radicando))/(2*a);
    x2 = (-b - Math.sqrt(radicando))/(2*a);
    /*presentación de resultados*/
    System.out.println("Las soluciones son: ");
    System.out.println("x1 = "+x1);
    System.out.println("x2 = "+x2);
      } else {
        System.out.println("no se puede hacer la raiz de un número negativo");
        }
      }
    }
  }
}
