public class ejercicio17 {
  public static void main(String[] args) {
    /* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
    Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
    serán de 4 unidades. No hay que comprobar que los datos se introducen
    correctamente; podemos suponer que el usuario los introduce bien. Dentro de
    la pecera hay que colocar de forma aleatoria un pececito, que puede estar
    situado en cualquiera de las posiciones que quedan en el hueco que forma el
    rectángulo. */
    int altura;
    int anchura;
    int pezy;
    int pezx;
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    altura=Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura (como mínimo 7): ");
    anchura=Integer.parseInt(System.console().readLine());
    pezy=(int)(((Math.random())*(altura-2))+1);
    pezx=(int)((Math.random())*(anchura-1));
    for (int i = 0; i < altura; i++) {
      System.out.print("* ");
      for (int j = 1; j < anchura; j++) {
        if ((i==0)||(i==altura-1)) {
          System.out.print("* ");
        } else if ((i==pezy)&&(j==pezx)) {
          System.out.print("& ");
        } else if ((j>=1)&&(j<anchura-1)) {
          System.out.print("  ");
        }
        if ((j==anchura-1)&&(i>0)&&(i<altura-1)) {
          System.out.print("*");
        } 
      }
      System.out.println();
    }
  }
}
