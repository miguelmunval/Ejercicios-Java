public class examen18_19_4 {
  public static void main(String[] args) {
    /* contar numeros mostrar asteriscos */
    int total;
    System.out.print("Introduzca el total de números que desea introducir: ");
    total=Integer.parseInt(System.console().readLine());
    int [] numeros = new int [total];
    System.out.println("Vaya introduciendo números y pulsando INTRO.");
    for (int i = 0; i < total; i++) {
      numeros[i]=Integer.parseInt(System.console().readLine());
    }
    System.out.println("Los números introducidos son: ");
    for (int i = 0; i < total; i++) {
      int contador=1;
      for (int j = 0; j < i; j++) if (numeros[i]==numeros[j]) contador++;
      
      System.out.print(numeros[i]);
      for (int j = 0; j < contador; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
