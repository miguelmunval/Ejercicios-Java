public class ejercicio18 {
  public static void main(String[] args) {
    /* Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
    ambos incluidos y que los almacene en un array. A continuación, el programa
    debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
    programa debe colocar de forma alterna y en orden los menores o iguales de
    100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
    mayor… Cuando se acaben los menores o los mayores, se completará con los
    números que queden. */
    int [] numeros = new int [10];
    int [] menores = new int [10];
    int cmenores=0;
    int cmenores2=0;
    int [] mayores = new int [10];
    int cmayores=0;
    int cmayores2=0;
    int x=0;
    for (int i = 0; i < 10; i++) {
      numeros[i]=(int)(Math.random()*201);
      if (numeros[i]<=100) {
        menores[cmenores]=numeros[i];
        cmenores++;
      } else {
        mayores[cmayores]=numeros[i];
        cmayores++;
      }
    }
    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numeros[i]);
    while (cmayores>0 && cmenores>0) {
      if (x%2==0) {
        numeros[x]=menores[cmenores2];
        cmenores2++;
        cmenores--;
      } else {
        numeros[x]=mayores[cmayores2];
        cmayores2++;
        cmayores--;
      }
      x++;
    }
    while (cmenores>0) {
      numeros[x]=menores[cmenores2];
      cmenores2++;
      cmenores--;
      x++;
    }
    while (cmayores>0) {
      numeros[x]=mayores[cmayores2];
      cmayores2++;
      cmayores--;
      x++;
    }
    System.out.println();
    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numeros[i]);
  }
}
