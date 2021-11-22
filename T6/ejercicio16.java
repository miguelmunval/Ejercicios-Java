public class ejercicio16 {
  public static void main(String[] args) {
    /* Realiza un simulador de máquina tragaperras simplificada que cumpla los
    siguientes requisitos:
    a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
    figuras posibles: corazón, diamante, herradura, campana y limón.
    b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
    perdido”.
    c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
    ha recuperado su moneda”.
    d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
    10 monedas”. */
    int aleatorio;
    int aux=0;
    int aux2=0;
    int aux3=0;
		for (int i = 0; i < 3; i++) {
      aux3=aux2;
      aux2=aux;
      aleatorio=(int)(Math.random()*5);
      switch (aleatorio) {
        case 0:
          System.out.print("corazón ");
          break;
        case 1:
        System.out.print("diamante ");
          break;
        case 2:
        System.out.print("herradura ");
          break;
        case 3:
        System.out.print("campana ");
          break;
        default:
          System.out.print("limón ");
          break;
      }
      aux=aleatorio;
    }
    System.out.println();
    if ((aux==aux2)&&(aux2==aux3)) {
      System.out.println("Enhorabuena, ha ganado 10 monedas");
    } else if ((aux==aux2)||(aux==aux3)||(aux2==aux3)) {
      System.out.println("Bien, ha recuperado su moneda");
    } else {
      System.out.println("Lo siento, ha perdido");
    }
  }
}
