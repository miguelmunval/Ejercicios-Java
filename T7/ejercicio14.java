public class ejercicio14 {
  public static void main(String[] args) {
    /* Escribe un programa que pida 8 palabras y las almacene en un array. A
    continuación, las palabras correspondientes a colores se deben almacenar al
    comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
    auxiliares como quieras. Los colores que conoce el programa deben estar en
    otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
    blanco y morado. */
    String colores[] = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    String [] palabras = new String [8];
    String [] aux = new String [8];
    String [] aux2 = new String [8];
    int x = 0;
    int y = 0;
    System.out.println("Debe introducir 8 palabras.");
    for (int i = 0; i < 8; i++) {
      int z = x;
      System.out.print("Introduzca 1 palabra: ");
      palabras[i]=System.console().readLine();
      for (int j = 0; j < 9; j++) {
        if (palabras[i].equals(colores[j])) {
          aux[x]=palabras[i];
          x++;
        } 
      }
      if (x == z) {
        aux2[y]=palabras[i];
        y++;
      }
    }
    for (int i = 0; i < 8; i++) System.out.printf("%-10d", i);
    System.out.println();
    for (int i = 0; i < 8; i++) System.out.printf("%-10s", palabras[i]);
    System.out.println();
    for (int i = 0; i < x; i++) {
      palabras[i]=aux[i];
    }
    for (int i = x; i < 8; i++) {
      palabras[i]=aux2[i-x];
    }
    for (int i = 0; i < 8; i++) System.out.printf("%-10d", i);
    System.out.println();
    for (int i = 0; i < 8; i++) System.out.printf("%-10s", palabras[i]);
  }
}
