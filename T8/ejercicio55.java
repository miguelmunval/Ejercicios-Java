public class ejercicio55 {
  public static void main(String[] args) {
    String [] palabras= {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};
    String [] resultado=sinRepetir(palabras);
    for (int i = 0; i < resultado.length; i++) {
      System.out.print(resultado[i]+" ");
    }
  }
  public static String[] sinRepetir(String[] s) {
    String [] resultado=new String[s.length];
    int posicion=0;
    for (int i = 0; i < s.length; i++) {
      int contador=0;
      for (int j = 0; j < posicion; j++) {
        if (s[i].equals(resultado[j])) {
          contador++;
        }
      }
      if (contador<1) {
        resultado[posicion]=s[i];
        posicion++;
      }
    }
    String [] resultadof=new String[posicion];
    for (int i = 0; i < resultadof.length; i++) {
      resultadof[i]=resultado[i];
    }
    return resultadof;
  }
}
