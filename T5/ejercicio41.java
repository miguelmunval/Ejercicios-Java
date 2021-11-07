public class ejercicio41 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long numero = Long.parseLong(System.console().readLine());
        long aux = numero;
        int pares = 0;
        int impares = 0;
        while (aux > 0) {
            if ((aux % 10) % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            aux /= 10;
        }
        System.out.print("El " + numero + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");
    }
}
