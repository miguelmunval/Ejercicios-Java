public class flechas2 {
    public static void main(String[] args) {
        int anchura;
        int altura;
        System.out.print("Introduzca la altura de la Flecha: ");
        altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la anchura de la Flecha: ");
        anchura = Integer.parseInt(System.console().readLine());
        int aux;
        aux = anchura + 1 - altura / 2;
        for (int i = 0; i < aux - 2; i++) {
          System.out.print(" ");
        }
        System.out.println("*");
    
        for (int i = 0; i < altura - 2; i++) {
          for (int j = 0; j < aux; j++)System.out.print("*");
          if ((altura - 2) / 2 > i) aux++;
          else aux--;
          System.out.println();
        }
        aux = anchura + 1 - altura / 2;
        for (int i = 0; i < aux - 2; i++) {
          System.out.print(" ");
        }
        System.out.println("*");
    }
}
