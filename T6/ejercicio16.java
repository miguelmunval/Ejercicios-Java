public class ejercicio16 {
  public static void main(String[] args) {
    int aleatorio;
    String aux="";
    String aux2="";
    String aux3="";
		for (int i = 0; i < 3; i++) {
      aux3=aux2;
      aux2=aux;
      aleatorio=(int)(Math.random()*6);
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
    }
    System.out.println();
    if ((aux.equals(aux2))||(aux.equals(aux3))||(aux2.equals(aux3))) {
      System.out.println("Bien, ha recuperado su moneda");
    } else {
      System.out.println("Lo siento, ha perdido");
    }
    if ((aux.equals(aux2))&&(aux.equals(aux3))&&(aux2.equals(aux3))) {
      System.out.println("Enhorabuena, ha ganado 10 monedas");
    }
  }
}
