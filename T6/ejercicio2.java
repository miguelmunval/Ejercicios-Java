public class ejercicio2 {
    public static void main(String[] args) {
        /*Realiza un programa que muestre al azar el nombre de una carta de la baraja
        francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
        y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
        numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
        1). Para convertir un número en una cadena de caracteres podemos usar
        String.valueOf(n).*/
        int numero = (int) (Math.random() * 13 + 1);
        String letracarta;
        String palo;
        switch (numero) {
          case 1:
            letracarta = "A";
            break;
          case 11:
            letracarta = "J";
            break;
          case 12:
            letracarta = "Q";
            break;
          case 13:
            letracarta = "K";
            break;
          default:
            letracarta = String.valueOf(numero);
            break;
        }
        numero = (int) (Math.random() * 4);
        switch (numero) {
          case 0:
            palo = "picas";
            break;
          case 1:
            palo = "corazones";
            break;
          case 2:
            palo = "diamantes";
            break;
          default:
            palo = "trevoles";
            break;
        }
        System.out.printf("La carta es %s de %s", letracarta, palo);
    
    }
}
