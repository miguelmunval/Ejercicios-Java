public class ejercicio13 {
  public static void main(String[] args) {
    /* Escribe un programa que rellene un array de 100 elementos con números enteros
    aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
    el programa mostrará el array y preguntará si el usuario quiere destacar el
    máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
    el número destacado entre dobles asteriscos. */
    int [] numero = new int [100];
    int maximo=0;
    int minimo=500;
    int destacar;
    for (int i = 0; i < 100; i++) {
      numero[i]=(int)(Math.random()*501);
      System.out.print(numero[i]+" ");
      if (numero[i]>maximo) {
        maximo=numero[i];
      } 
      if (numero[i]<minimo) {
        minimo=numero[i];
      }
    }
    System.out.println();
    System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    destacar=Integer.parseInt(System.console().readLine());
    for (int i = 0; i < 100; i++) {
      if (destacar==1) {
        if (numero[i]==minimo) {
          System.out.print("** "+numero[i]+" ** ");
        } else {
          System.out.print(numero[i]+" ");
        }
      }
      if (destacar==2) {
        if (numero[i]==maximo) {
          System.out.print("** "+numero[i]+" ** ");
        } else {
          System.out.print(numero[i]+" ");
        }
      }
    }
  }
}
