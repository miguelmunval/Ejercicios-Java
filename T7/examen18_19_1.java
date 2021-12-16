import java.util.Scanner;

public class examen18_19_1 {
  /* ahorcado */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String palabras[] = { "HOLA", "ADIOS", "MANZANA", "PERA", "MAMA", "PAPA", "CUNA", "TAZA", "CROMO", "MICROFONO" };
    char letras[] = new char[10];
    int aleatoria = (int) (Math.random() * 10);
    String palabra = palabras[aleatoria];
    char [] oculta= {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'};
    int fallos=5;
    Boolean esta = false;
    for (int i = 0; i < palabra.length(); i++) {
        letras[i] = palabra.charAt(i);
    }
    do {
      for (int i = 0; i < palabra.length(); i++) {
        System.out.printf("%-5s", oculta[i]);
      }
      System.out.println();
      System.out.print("Introduzca una letra(en mayusculas): "); 
      char letra=s.next().charAt(0);
      for (int i = 0; i < palabra.length(); i++) {
        if (letras[i]==letra) {
          oculta[i]=letras[i];
          esta=false;
        } else {
          esta=true;
        }
      }
      if (esta) {
        fallos--;
      }
    } while (fallos!=0);
    s.close();
  }
}
