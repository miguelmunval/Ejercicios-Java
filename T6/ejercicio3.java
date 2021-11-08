public class ejercicio3 {
    public static void main(String[] args) {
        /*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
        de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/
        int numero = (int) (Math.random() * 10 + 1);
        String letracarta;
        String palo;
        switch (numero) {
          case 1:
            letracarta = "as";
            break;
          case 8:
            letracarta = "sota";
            break;
          case 9:
            letracarta = "caballo";
            break;
          case 10:
            letracarta = "rey";
            break;
          default:
            letracarta = String.valueOf(numero);
            break;
        }
        numero = (int) (Math.random() * 4);
        switch (numero) {
          case 0:
            palo = "oros";
            break;
          case 1:
            palo = "copas";
            break;
          case 2:
            palo = "espadas";
            break;
          default:
            palo = "bastos";
            break;
        }
        System.out.printf("La carta es %s de %s", letracarta, palo);
    }
}
