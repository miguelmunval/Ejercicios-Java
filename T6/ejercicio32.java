public class ejercicio32 {
  public static void main(String[] args) {
    /* Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
    el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
    del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
    espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
    la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
    Por cada metro de sendero - representado por una línea - puede que haya un
    obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
    es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
    sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
    O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
    habrá más de un obstáculo por metro de sendero, habrá uno o ninguno. */
    int longitud;
    int espacios = 10;
    int aleatorio;
    char obstaculo;

    System.out.print("Introduzca la longitud del sendero en metros: ");
    longitud = Integer.parseInt(System.console().readLine());

    for (int i = 1; i <= longitud; i++) {

      aleatorio = (int) (Math.random() * 4);

      switch (aleatorio) {
        case 1:
          obstaculo = '*';
          break;
        case 2:
          obstaculo = 'o';
          break;
        default:
          obstaculo = ' ';
          break;
      }

      aleatorio = (int) (Math.random() * 4) + 1;

      for (int j = 0; j < espacios; j++) System.out.print(" ");

      for (int j = 0; j < 6; j++) System.out.print(j == 0 || j == 5 ? "|" : (j == aleatorio) ? obstaculo : " ");

      System.out.println();

      espacios += (int) (Math.random() * 3) - 1;

    }
  }
}
