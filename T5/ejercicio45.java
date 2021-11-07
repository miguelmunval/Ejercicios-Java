public class ejercicio45 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca la posición dentro del número: ");
        long posicion = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca el nuevo dígito: ");
        long digito = Long.parseLong(System.console().readLine());
        long aux = numero;
        int x = 0;
        do {
            aux /= 10;
            x++;
        } while (aux > 0);
            long izquierda = numero / (long)(Math.pow(10, x - posicion + 1));
            izquierda = izquierda * 10 + digito;
            long derecha = numero % (long)(Math.pow(10, x - posicion));
            aux = izquierda * (long)(Math.pow(10, x - posicion)) + derecha;
            System.out.print("El número resultante es " + aux);
    }
}
