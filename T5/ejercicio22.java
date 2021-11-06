public class ejercicio22 {
    public static void main(String[] args) {
        int numero = 2;
        boolean primo = true;
        int i = 2;
        while (numero < 100) {
            numero++;
            primo = true;
            while (i < numero) {
                if (numero % i == 0) {
                    primo = false;
                    i++;
                } 
            }
            if (primo) {
                System.out.print(numero+" ");
            }
        }
    }
}
