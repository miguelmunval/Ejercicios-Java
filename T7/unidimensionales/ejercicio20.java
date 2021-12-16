public class ejercicio20 {
  public static void main(String[] args) {
    /* Implementa un programa que calcule la denominación ordinal de los reyes de
    una secuencia histórica. El programa solicitará la cantidad de reyes que se
    van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
    por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
    por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
    aparecer como Felipe 1º y el segundo como Felipe 2º. */
    int total;
    System.out.print("Introduzca el número total de nombres de reyes: ");
    total=Integer.parseInt(System.console().readLine());
    String [] nombres = new String [total];
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    for (int i = 0; i < total; i++) {
      nombres[i]=System.console().readLine();
    }
    System.out.println("Los reyes introducidos son: ");
    for (int i = 0; i < total; i++) {
      int contador=1;
      for (int j = 0; j < i; j++) if (nombres[i].equals(nombres[j])) contador++;
      
      System.out.println(nombres[i] + " " + contador+"º");
    }
  }
}
