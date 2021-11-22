public class ejercicio26 {
  public static void main(String[] args) {
    int altura;
    int anchura;
    int bocadoy;
    int bocadox;
    System.out.print("Por favor, introduzca la altura de la tableta: ");
    altura=Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura: ");
    anchura=Integer.parseInt(System.console().readLine());
    do {
    bocadoy=(int)(((Math.random())*(altura)));
    bocadox=(int)((Math.random())*(anchura));
    } while (((bocadox>=1)&&((bocadoy>0)&&(bocadoy<altura))));
    System.out.println(bocadox);
    System.out.println(bocadoy);
    System.out.println();
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {
        if ((i!=bocadoy)||(j!=bocadox)) {
          System.out.print("*");
        } else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
