public class ejercicio6{
  public static void main(String[]args){
  float h;
  double t;
  double g = 9.81;
  System.out.print("Introduzca una altura: ");
  h = Float.parseFloat(System.console().readLine());
  t = Math.sqrt(2 * h / g);
  System.out.println("El tiempo que tartará en caer es de: "+(float)t+" seg");
  }
}
