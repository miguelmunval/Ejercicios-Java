public class examen18_19_3a {
  public static void main(String[] args) {
    /* numeros perfectos */
    long numero;
    System.out.print("Introduzca un número: ");
    numero=Integer.parseInt(System.console().readLine());
    for(long i = 2 ; i < numero ; i++){
      long suma=0;
      for (long j = 1; j < i; j++) {
        if(i%j==0){
          suma+=j;
        }
      }
      if (i==suma) {
        System.out.print(i+" ");
      }
    }
  }
}