public class ejercicio7 {
  public static void main(String[] args) {
    /* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
    muestre por pantalla separados por espacios. El programa pedirá entonces por
    teclado dos valores y a continuación cambiará todas las ocurrencias del primer
    valor por el segundo en la lista generada anteriormente. Los números que se
    han cambiado deben aparecer entrecomillados. */
    int [] numero = new int[100];
    int cambiar;
    int cambio;
    for (int i = 0; i < 100; i++) {
      System.out.print((numero[i]=(int)(Math.random()*21))+" ");
    }
    System.out.println();
    System.out.print("Introduzca el número a cambiar: ");
    cambiar=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número por el que se cambia: ");
    cambio=Integer.parseInt(System.console().readLine());
    for (int i = 0; i < 100; i++) {
      if (numero[i]==cambiar) {
        numero[i]=cambio;
        System.out.print("\""+numero[i]+"\" ");
      } else {
        System.out.print(numero[i]+" ");
      }
    }
  }
}
