public class Ejercicio1_2 {

    public static void main(String[] args) {
        /**
         * ] Implemente un programa que solicite al usuario un par de números, que se
         * corresponderán con el número de filas y el número de columnas de un tablero.
         * Dicho tablero deberá presentarse por consola "al estilo" de los tableros de
         * ajedrez. Para pintar la cuadrícula "rellena" puede utilizar dos caracteres
         * "cuadrícula rellena". El carácter cuadrícula rellena es: █. Vea los
         * siguientes ejemplos:
         */
        int altura;
        int anchura;
        do {
            System.out.print("Introduzca la altura: ");
            altura = Integer.parseInt(System.console().readLine());
            System.out.print("Introduzca la anchura: ");
            anchura = Integer.parseInt(System.console().readLine());
        } while (!(altura > 0 && anchura > 0 && altura <= 20 && anchura <= 20));

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print((i + j) % 2 == 0 ? "  " : "██");
            }
            System.out.println();
        }
    }
}