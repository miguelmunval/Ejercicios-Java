public class ejercicio51 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        int aux = numero;
        int reves = 0;
        boolean quitado = false;
        // Al mismo tiempo que se le da la vuelta al número
        // se le quitan los 0s y 8s
        while (aux > 0) {
            if ((aux % 10 != 0) && (aux % 10 != 8)) {
                reves = (reves * 10) + (aux % 10);
            } else {
                quitado = true;
            }
            aux /= 10;
        }
        // Se le vuelve a dar la vuelta al número
        aux = reves;
        reves = 0;
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux /= 10;
        }
        if (quitado) {
            System.out.print("Después de haber sido comido por el gusano numérico");
            System.out.println(" se queda en: " + reves);
        } else {
            System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }
    }
}
