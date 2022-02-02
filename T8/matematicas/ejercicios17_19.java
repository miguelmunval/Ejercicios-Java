package matematicas;
public class ejercicios17_19 {
  public static void main(String[] args) {
    int binario=10000;
    int decimal=decimalbinario(binario);
    System.out.println(decimal);
  }
  public static int binariodecimal(int x) {
    int lng=ejercicios1_14.digitos(x);
    int decimal=0;
    int digito;
    for (int i = 0; i < lng; i++) {
      digito=x%10;
      x/=10;
      decimal+=digito*(int)Math.pow(2, i);
    }
    return decimal;
  }
  public static int decimalbinario(int x) {
    int lng=ejercicios1_14.digitos(x);
    int resultado=0;
    for (int i = 0; i < lng+5; i++) {
      resultado+=x%2;
      x/=2;
      resultado*=10;
    }
    int comp=ejercicios1_14.digitos(resultado);
    resultado=ejercicios1_14.voltea(resultado);
    int comp2=ejercicios1_14.digitos(resultado);
    if (comp>comp2) {
      for (int i = 0; i <= comp-comp2; i++) {
        resultado*=10;
      }
    }
    return resultado;
  }
  
}
