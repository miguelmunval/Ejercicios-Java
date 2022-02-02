public class ejercicio16 {
  public static void main(String[] args) {
    for (int i = 1; i < 100000; i++) {
      if (matematicas.ejercicios1_14.escapicua(i)) {
        System.out.print(i+" ");
      }
    }
  }
}
