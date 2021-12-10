public class ejercicio10 {
  public static void main(String[] args) {
    /* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
    y que los almacene en un array. El programa debe ser capaz de pasar todos
    los números pares a las primeras posiciones del array (del 0 en adelante) y
    todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
    necesario. */
    int [] numero = new int [20];
    int [] pares = new int [20];
    int [] impares = new int [20];
    int cpares = 0;
    int cimpares = 1;
    for (int i = 0; i < 20; i++) {
      numero[i]=(int)(Math.random()*101);
      if ((numero[i]%2)==0) {
        pares[cpares]=numero[i];
        cpares++;
      } else {
        impares[20 - cimpares]=numero[i];
        cimpares++;
      }
    }
    for (int i = 0; i < cpares; i++) {
      numero[i]=pares[i];
    }
    for (int i = 19; i > 20-cimpares; i--) {
      numero[i]=impares[i];
    }
    for (int i = 0; i < numero.length; i++) {
      System.out.print(numero[i]+" ");
    }
  }
}
