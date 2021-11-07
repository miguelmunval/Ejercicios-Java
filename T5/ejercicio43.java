public class ejercicio43 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long numero = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        long posicion = Long.parseLong(System.console().readLine());
        long aux = numero;
        int x = 0;
        do {
            aux /= 10;
            x++;
        } while (aux > 0);
            //Math.pow sirve para hacer potencias.
            long izquierda = numero / (long)(Math.pow(10, x - posicion + 1));
            long derecha = numero % (long)(Math.pow(10, x - posicion + 1));
            System.out.print("Los números partidos son el " + izquierda + " y el " + derecha + ".");
    }
}
