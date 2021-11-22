public class ejercicio25 {
  public static void main(String[] args) {
    /* Escribe un programa que muestre por pantalla 100 números enteros separados
    por un espacio. Los números deben estar generados de forma aleatoria en
    un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
    almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]). */
    int numero;
    for (int i = 0; i < 100; i++) {
      numero=(int)((Math.random()*191)+10);
      if ((numero%5)==0) {
        System.out.print("["+numero+"] ");
      }
      for (int j = 2; i < numero; i++) {
        if ((numero % j) != 0) {
            System.out.print("#"+numero+"# ");
        } 
        if (((numero%5)!=0)&&(numero%j)==0) {
          System.out.print(numero+" ");
        }
      }
    }
  }
}
