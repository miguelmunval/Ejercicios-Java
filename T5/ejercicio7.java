public class ejercicio7 {
    public static void main(String[] args) {
        int codigo = 5823;
        int numero;
        for (int i = 0; i < 4; i++) {
            System.out.print("Por favor, introduzca el código correcto para abrir la caja fuerte: ");
            numero=Integer.parseInt(System.console().readLine());
            if (numero == codigo) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
    }
}
