public class ejercicio16 {
  public static void main(String[] args) {
    /* Escribe un programa que rellene un array de 20 elementos con números enteros
    aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
    programa mostrará el array y preguntará si el usuario quiere resaltar los
    múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
    escribiendo los números que se quieren resaltar entre corchetes. */
    int [] numeros = new int [20];
    int resaltar;
    for (int i = 0; i < 20; i++) {
      System.out.print((numeros[i]=(int)(Math.random()*401))+" ");
    }
    System.out.println();
    System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    resaltar=Integer.parseInt(System.console().readLine());
    for (int i = 0; i < 20; i++) {
      if (resaltar==1) {
        if ((numeros[i]%5)==0) {
          System.out.print("["+numeros[i]+"] ");
        } else {
          System.out.print(numeros[i]+" ");
        }
      }
      if (resaltar==2) {
        if ((numeros[i]%7)==0) {
          System.out.print("["+numeros[i]+"] ");
        } else {
          System.out.print(numeros[i]+" ");
        }
      }
    }
  }
}
