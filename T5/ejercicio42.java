public class ejercicio42 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        boolean primo;
        for (int i = numero; i < numero + 5; i++) {
            primo = true;
            for (int j = 2; j< i; j++) {
            if (i % j == 0) {
                primo = false;
            }
            }
            if (primo) {
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " no es primo");
            }
        }
        System.out.println();
    }
}
