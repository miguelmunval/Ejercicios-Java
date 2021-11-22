public class ejercicio19 {
  public static void main(String[] args) {
    /* Escribe un programa que muestre 50 números enteros aleatorios comprendidos
    entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
    el máximo de los pares el mínimo de los impares y la media de todos los
    números generados. */
    int numero;
    int suma=0;
    int media;
    int maxpar=-100;
    int minimpar=200;
    int contador=0;
    for (int i = 0; i < 50; i++) {
      numero = (int)((Math.random()*301)-100);
      System.out.print(numero+" ");
      if (((numero%2)==0)&&(numero>maxpar)) {
        maxpar=numero;
      }
      if (((numero%2)!=0)&&(numero<minimpar)) {
        minimpar=numero;
      }
      contador++;
      suma+=numero;
    }
    media=suma/contador;
    System.out.println();
    System.out.printf("El par máximo es %d, el impar minimo es %d y la media de todos es %d",maxpar, minimpar, media);
  }
}
