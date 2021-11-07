public class ejercicio36 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long numero = Long.parseLong(System.console().readLine());
        long aux = numero;
        long reves = 0;
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux /= 10;
        }
        if (reves == numero) {
            System.out.println("El "+numero+" es capicúa");
        } else {
            System.out.println("El "+numero+" no es capicúa");
        }
    }
}
