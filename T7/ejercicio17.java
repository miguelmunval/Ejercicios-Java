public class ejercicio17 {
  public static void main(String[] args) {
    /* Escribe un programa que muestre por pantalla un array de 10 números enteros
    generados al azar entre 0 y 100. A continuación, el programa debe pedir un
    número al usuario. Se debe comprobar que el número introducido por teclado
    se encuentra dentro del array, en caso contrario se mostrará un mensaje por
    pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
    correctamente. A continuación, el programa rotará el array hacia la derecha
    las veces que haga falta hasta que el número introducido quede situado en la
    posición 0 del array. Por último, se mostrará el array rotado por pantalla. */
    int [] numeros = new int [20];
    int numero;
    boolean dentro;
    int aux;
    boolean primero;
    for (int i = 0; i < 10; i++) {
      System.out.print((numeros[i]=(int)(Math.random()*101))+" ");
    }
    System.out.println();
    do {
      dentro=false;
      System.out.print("Deme un número: ");
      numero=Integer.parseInt(System.console().readLine());
      for (int i = 0; i < 10; i++) {
        if (numero==numeros[i]) {
          dentro=true;
        }
      }
      if (!dentro) {
        System.out.println("Por favor, introduzca un número correcto.");
      }
    } while (!dentro);
    do {
      primero=false;
      aux=numeros[9];
      for (int i = 9; i > 0; i--) {
        numeros[i] = numeros[i - 1];
      }
      numeros[0]=aux;
      if (numero==numeros[0]) {
        primero=true;
      }
    } while (!primero);
    for (int i = 0; i < 10; i++) {
      System.out.print(numeros[i]+" ");
    }
  }
}
