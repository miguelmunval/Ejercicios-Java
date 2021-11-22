public class ejercicio21 {
  public static void main(String[] args) {
    /* Realiza un programa que genere una secuencia de cinco monedas de curso
    legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
    5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
    posiciones posibles son cara y cruz. */
    int lado;
    for (int i = 0; i < 5; i++) {
      switch (i) {
        case 0:
          System.out.print("2 céntimos - ");
          break;
        case 1:
          System.out.print("20 céntimos - ");
          break;
        case 2:
          System.out.print("50 céntimos - ");
          break;
        case 3:
          System.out.print("1 euro - ");
          break;
        case 4:
          System.out.print("2 euros - ");
          break;
        default:
          break;
      }
      lado=(int)((Math.random()*2)+1);
      switch (lado) {
        case 1:
          System.out.println("cara");
          break;
        case 2:
          System.out.println("cruz");
          break;
        default:
          break;
      }
    }
  }
}
