package matematicas;
public class ejercicios1_14 {
  /* 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
  es capicúa y falso en caso contrario. */
    public static boolean escapicua(int x) {
        int reves=voltea(x);
        if (x==reves) {
            return true;
        }
        return false;
    }
    /* 6. voltea: Le da la vuelta a un número. */
    public static int voltea(int x) {
        int aux = x;
        int reves = 0;
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux /= 10;
        }
        return reves;
    }
    /* 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
  es primo y falso en caso contrario. */
    public static boolean primo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
            return false;
            }
        }
            return true;
    }
    /* 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
    se pasa como parámetro. */
    public static int siguienteprimo(int x) {
        boolean primo=false;
        x=x+1;
        do {
          for (int i = 2; i < 10; i++) {
            if ((x % i) == 0) {
            primo=true;
            }
          }
          primo=false;
          x++;
        } while (!primo);
        return x;
    }
    /* 4. potencia: Dada una base y un exponente devuelve la potencia. */
    public static int potencia(int x, int d) {
      int numero= (int)Math.pow(x, d);
      return numero;
    }
    /* 5. digitos: Cuenta el número de dígitos de un número entero. */
    public static int digitos(int x) {
      int contador=0;
      do {
        x/=10;
        contador++;
      } while (x>=1);
      return contador;
    }
    /* 7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
    Se empieza contando por el 0 y de izquierda a derecha. */
    public static int digiton(int x, int n) {
      int resultado=0;
      int numero=voltea(x);
      for (int i = 0; i < n; i++) {
        resultado=numero%10;
        numero/=10;
      }
      return resultado;
    }
    /* 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
    derecha). */
    public static int quitardetras(int x, int n) {
      for (int i = 0; i < n; i++) {
        x/=10;
      }
      return x;
    }
    /* 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
    izquierda). */
    public static int quitardelante(int x, int n) {
      int volteado=voltea(x);
      for (int i = 0; i < n; i++) {
        volteado/=10;
      }
      x=voltea(volteado);
      return x;
    }
    /* 11. pegaPorDetras: Añade un dígito a un número por detrás. */
    public static int pegardetras(int x, int n) {
      int m=digitos(n);
      for (int i = 0; i < m; i++) {
        x*=10;
      }
      x+=n;
      return x;
    }
    /* 12. pegaPorDelante: Añade un dígito a un número por delante. */
    public static int pegardelante(int x, int n) {
      int m=digitos(n);
      int volteado=voltea(x);
      for (int i = 0; i < m; i++) {
        volteado=10;
      }
      x=voltea(volteado);
      x+=n;
      return x;
    }
    /* 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
    dentro de un número y devuelve el trozo correspondiente. */
    public static int trozonumero(int x) {
      x/=10;
      x=voltea(x);
      x/=10;
      x=voltea(x);
      return x;
    }
    /* 14. juntaNumeros: Pega dos números para formar uno. */
    public static int juntanumeros(int x, int n) {
      int juntos=pegardetras(x, n);
      return juntos;
    }
}
