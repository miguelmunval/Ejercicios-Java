public class ejercicio39 {
    public static void main(String[] args) {
        int numero;
        System.out.print("Introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= numero; i++) {
            int factorial = i;
            for (int j = 1; j < i; j++) {
                factorial *= j;
            }
            System.out.println(i + "! = " + factorial);
        }
    }
}
