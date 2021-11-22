public class ejercicio18 {
  public static void main(String[] args) {
    /* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
    sustituir el color blanco por colores más alegres. Realiza un programa que
    genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
    cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
    debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
    naranja. */
    int aleatorio, aleatorio1, aleatorio2;
      do {
        aleatorio=(int)((Math.random()*6));
        aleatorio1=(int)((Math.random()*6));
        aleatorio2=(int)((Math.random()*6));
      } while ((aleatorio==aleatorio1)||(aleatorio1==aleatorio2)||(aleatorio==aleatorio2));
      switch (aleatorio) {
        case 0:
          System.out.print("rojo ");
          break;
        case 1:
          System.out.print("azul ");
          break;
        case 2:
          System.out.print("verde ");
          break;
        case 3:
          System.out.print("amarillo ");
          break;
        case 4:
          System.out.print("violeta ");
          break;
        default:
          System.out.print("naranja ");
          break;
      }
      switch (aleatorio1) {
        case 0:
          System.out.print("rojo ");
          break;
        case 1:
          System.out.print("azul ");
          break;
        case 2:
          System.out.print("verde ");
          break;
        case 3:
          System.out.print("amarillo ");
          break;
        case 4:
          System.out.print("violeta ");
          break;
        default:
          System.out.print("naranja ");
          break;
      }
    
    switch (aleatorio2) {
      case 0:
        System.out.print("rojo ");
        break;
      case 1:
        System.out.print("azul ");
        break;
      case 2:
        System.out.print("verde ");
        break;
      case 3:
        System.out.print("amarillo ");
        break;
      case 4:
        System.out.print("violeta ");
        break;
      default:
        System.out.print("naranja ");
        break;
    }
  }
}
