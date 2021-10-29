public class ejercicio17 {
    public static void main(String[] args) {
        int numero;
        int contador;
        int resultado;
        System.out.print("Introduzca el número desde el que desea partir: ");
        numero = Integer.parseInt(System.console().readLine());
        if (numero < 0) {
            System.out.println("Por favor, introduzca un número positivo.");
            return;
        } else {
            for (int i = 0; i < 100; i++) {
                numero += 1;
                contador = numero;
                resultado = numero + contador;
                System.out.println("La suma de "+numero+" + "+contador+" es de: "+resultado);
            }   
        }
    }
}
