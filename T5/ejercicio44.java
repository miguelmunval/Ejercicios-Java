public class ejercicio44 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long numero = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca la posición donde quiere insertar el dígito: ");
        long posicion = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca el dígito que quiere insertar: ");
        long digito = Long.parseLong(System.console().readLine());
        long aux = numero;
        int x = 0;
        do {
            aux /= 10;
            x++;
        } while (aux > 0);
            long izquierda = numero / (long)(Math.pow(10, x - posicion + 1));
            izquierda = izquierda * 10 + digito;
            long derecha = numero % (long)(Math.pow(10, x - posicion + 1));
            aux = izquierda * (long)(Math.pow(10, x - posicion + 1)) + derecha;
            System.out.print("El número resultante es " + aux);
            //Math.pow sirve para hacer potencias.
    }
}
