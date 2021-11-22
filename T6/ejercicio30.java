public class ejercicio30 {
  public static void main(String[] args) {
    /* El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
    Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
    le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
    con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
    una cuestión de física elemental, ninguno de los animales puede coincidir
    en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
    que como mínimo serán de 4 unidades. */
    int altura;
    int anchura;
    int pezy, pezx, caballoy, caballox, caracolay, caracolax;
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    altura=Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura (como mínimo 7): ");
    anchura=Integer.parseInt(System.console().readLine());
    pezy=(int)(((Math.random())*(altura-2))+1);
    pezx=(int)((Math.random())*(anchura-1));
    do {
      caballoy=(int)(((Math.random())*(altura-2))+1);
      caballox=(int)((Math.random())*(anchura-1));
    } while ((caballoy==pezy)&&(caballox==pezx));
    do {
      caracolay=(int)(((Math.random())*(altura-2))+1);
      caracolax=(int)((Math.random())*(anchura-1));
    } while (((caracolay==pezy)&&(caracolax==pezx))||((caracolay==caballoy)&&(caracolax==caballox)));
    System.out.println(caracolax+", "+caracolay);
    for (int i = 0; i < altura; i++) {
      System.out.print("* ");
      for (int j = 1; j < anchura; j++) {
        if ((i==0)||(i==altura-1)) {
          System.out.print("* ");
        } else if ((i==pezy)&&(j==pezx)) {
          System.out.print("& ");
        } else if ((i==caballoy)&&(j==caballox)) {
          System.out.print("$ ");
        } else if ((i==caracolay)&&(j==caracolax)) {
          System.out.print("@ ");
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
