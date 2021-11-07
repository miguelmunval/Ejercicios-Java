public class ejercicio48 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long numero = Long.parseLong(System.console().readLine());
        long aux;
        boolean encontrar;
        System.out.print("Dígitos que aparecen: ");
        for (int i = 0; i < 10; i++) {
        // Comprueba si i está en el número
            encontrar = false;
            aux = numero;
            while (aux > 0) {
            if (aux % 10 == i) {
            encontrar = true;
            }
            aux /= 10;
            }
            if (encontrar) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nDígitos que no: ");
        for (int i = 0; i < 10; i++) {
            // Comprueba si i está en el número
            encontrar = false;
            aux = numero;
            while (aux > 0) {
                if (aux % 10 == i) {
                    encontrar = true;
                }
                aux /= 10;
            }
            if (!encontrar) {
                System.out.print(i + " ");
            }
        }
    }
}
