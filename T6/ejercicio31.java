public class ejercicio31 {
  public static void main(String[] args) {
    /* Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
    partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
    muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
    11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
    si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
    suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
    da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
    entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
    ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
    pierde. Si sale otro número, tiene que seguir tirando. */
    int apuesta;
    int dado1, dado2;
    int dado3, dado4;
    int suma, suma2;
    System.out.print("Introduzca la cantidad que quiere apostar: ");
    apuesta=Integer.parseInt(System.console().readLine());
    dado1=(int)((Math.random()*6)+1);
    dado2=(int)((Math.random()*6)+1);
    suma=dado1+dado2;
    switch (suma) {
      case 2:
        System.out.println("Lo siento, ha perdido");
        break;
      case 3:
        System.out.println("Lo siento, ha perdido");
        break;
      case 7:
        System.out.println("Enhorabuena, ha ganado "+apuesta*2+"€");
        break;
      case 11:
        System.out.println("Enhorabuena, ha ganado "+apuesta*2+"€");
        break;
      case 12:
        System.out.println("Lo siento, ha perdido");
        break;
      default:
        do {
        dado3=(int)((Math.random()*6)+1);
        dado4=(int)((Math.random()*6)+1);
        suma2=dado3+dado4;
        } while ((suma2!=7)||(suma2!=suma));
        if (suma2==7) {
          System.out.println("Lo siento, ha perdido");
        } else if (suma2==suma) {
          System.out.println("Enhorabuena, ha ganado "+apuesta*2+"€");
        }
        break;
    }
  }
}
