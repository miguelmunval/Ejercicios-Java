public class ejercicio29 {
    public static void main(String[] args) {
        int numero;
        int divisor;
        System.out.print("Introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un divisor: ");
        divisor = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= numero; i++) {
            if ((i%divisor) != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
